package pack1;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("venkata");

String s = "Venkata";
StringBuilder str = new StringBuilder(s);
/*
 * str.deleteCharAt(4); System.out.println(str);
 */
str.setCharAt(6,'x');
System.out.println(str);

	}

}
