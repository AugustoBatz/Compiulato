
package lexico;

/**
 *
 * @author sys515
 */
public class Contador {
    public int decimales;
    public int hexadecimales;
    public int Romano;
    public int Octal;
    public int binario;
    public Contador()
    {
        this.decimales=0;
        this.hexadecimales=0;
        this.Romano=0;
        this.Octal=0;        
        this.binario=0;
    }
    public void addBinario()
    {
        this.binario++;
    }

    public int getBinario() {
        return binario;
    }

    public void setBinario(int binario) {
        this.binario = binario;
    }
    public void addRomano()
    {
        this.Romano++;
    }

    public int getRomano() {
        return Romano;
    }

    public void setRomano(int Romano) {
        this.Romano = Romano;
    }
    public void addOctal()
    {
        this.Octal++;
    }

    public int getOctal() {
        return Octal;
    }

    public void setOctal(int Octal) {
        this.Octal = Octal;
    }
    public void addDecimal()
    {
        this.decimales++;
    }
    public void addHexadecimal()
    {
        this.hexadecimales++;
    }

    public int getDecimales() {
        return decimales;
    }

    public void setDecimales(int decimales) {
        this.decimales = decimales;
    }

    public int getHexadeimales() {
        return hexadecimales;
    }

    public void setHexadeimales(int hexadeimales) {
        this.hexadecimales = hexadeimales;
    }
    
}
