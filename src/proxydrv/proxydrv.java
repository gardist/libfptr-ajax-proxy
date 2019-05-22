package proxydrv;

import java.util.Random;
import java.util.Date;

import ru.atol.drivers10.fptr.Fptr;
import ru.atol.drivers10.fptr.IFptr;

public class proxydrv {

	public static void main(String[] argv) {

		IFptr fptr = new Fptr();

		try {
			  fptr.setSingleSetting(IFptr.LIBFPTR_SETTING_MODEL, String.valueOf(IFptr.LIBFPTR_MODEL_ATOL_AUTO));
			  fptr.setSingleSetting(IFptr.LIBFPTR_SETTING_PORT, String.valueOf(IFptr.LIBFPTR_PORT_USB));
			  fptr.setSingleSetting(IFptr.LIBFPTR_SETTING_BAUDRATE, String.valueOf(IFptr.LIBFPTR_PORT_BR_115200));
			  fptr.applySingleSettings();

			fptr.open();
			fptr.setParam(IFptr.LIBFPTR_PARAM_JSON_DATA, argv[0]);
			int vResult = fptr.processJson();
			if (vResult<0) {
			    System.out.println("{\"error\":1, \"error_code\":"+fptr.errorCode()+", \"result\":\""+fptr.errorDescription()+"\"}");
			} else {
			    String vJsonResult = fptr.getParamString(IFptr.LIBFPTR_PARAM_JSON_DATA);
			    vJsonResult = vJsonResult.replaceAll("(\r\n|\n)", "");
			    if (vJsonResult.length()>0) {
				System.out.println("{\"error\":-1, \"result\":"+vJsonResult+"}");
			    } else {
				System.out.println("{\"error\":-1, \"result\":\"no data\"}");
			    }
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			fptr.close();
		}
	}	
}
