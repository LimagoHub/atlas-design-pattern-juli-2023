package de.math;

import de.common.LoggerProxy;

public class CalculatorFactory {


    private static boolean logger = true;
    private static boolean secured = true;

    public static boolean isLogger() {
        return logger;
    }

    public static void setLogger(final boolean logger) {
        CalculatorFactory.logger = logger;
    }

    public static boolean isSecured() {
        return secured;
    }

    public static void setSecured(final boolean secured) {
        CalculatorFactory.secured = secured;
    }

    public static Calculator createInstance() {
        // 1000
        Calculator result = new CalculatorImpl();
        //2000                        1000
        if(logger)
            //result = new CalculatorLogger(result);
            result = (Calculator) LoggerProxy.newInstance(result);
        //3000                        2000
        if(secured) result = new CalculatorSecure(result);
        return result;
    }
}
