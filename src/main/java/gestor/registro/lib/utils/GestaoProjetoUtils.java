package gestor.registro.lib.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class GestaoProjetoUtils {

	/**
	 * Reflexão para converter qualquer Objeto em outro
	 */
	public static <R, D> D toConvertReflection(R record, Class<D> dtoClass) {
		try {
			D dto = dtoClass.getDeclaredConstructor().newInstance();
			Map<String, Method> dtoSetters = getSetters(dtoClass);
			Field[] fields = record.getClass().getDeclaredFields();

			for (Field field : fields) {
				field.setAccessible(true);
				String fieldName = field.getName();
				Object value = field.get(record);

				String setterName = "set" + Character.toUpperCase(fieldName.charAt(0)) + fieldName.substring(1);
				Method setter = dtoSetters.get(setterName);

				if (setter != null) {
					setter.invoke(dto, value);
				}
			}
			return dto;

		} catch (Exception e) {
			throw new RuntimeException(getMensagem("Erro ao converter Record para DTO", e.getMessage()));
		}
	}

	private static Map<String, Method> getSetters(Class<?> clazz) {
		Map<String, Method> setters = new HashMap<>();
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			if (method.getName().startsWith("set") && method.getParameterCount() == 1) {
				setters.put(method.getName(), method);
			}
		}
		return setters;
	}
	
	public static String getMensagem(final Object... objs) {
		StringBuilder msg = new StringBuilder();
		for(Object obj: objs) {
			msg.append(obj.toString());
		}
		
		return msg.toString();
	}
}
