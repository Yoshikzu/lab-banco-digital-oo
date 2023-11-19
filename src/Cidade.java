package src;

public class Cidade {

    private int codMunicipio;
    private String cidade;
    private String uf;

    public Cidade(int codMunicipio, String cidade, String uf) {
        this.codMunicipio = codMunicipio;
        this.cidade = cidade;
        this.uf = uf;
    }

    public int getCodMunicipio() {
        return codMunicipio;
    }

    public void setCodMunicipio(int codMunicipio) {
        this.codMunicipio = codMunicipio;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
