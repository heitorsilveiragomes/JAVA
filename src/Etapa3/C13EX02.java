package Etapa3;

import java.security.cert.X509Certificate;

public class C13EX02 {
    public static double Calcularfx(double x, double fx) {

        if (x > 4)
            fx = (5 * x + 3) / Math.sqrt(Math.pow(x, 2) - 16);
        else if (x < 4)
            fx = (5 * x + 3) / Math.sqrt(16 - Math.pow(x, 2));
        else if (x == 4)
        fx = 0;
        return fx;
    }
}
