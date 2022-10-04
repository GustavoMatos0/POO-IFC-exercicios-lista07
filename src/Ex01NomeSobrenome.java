
public class Ex01NomeSobrenome {

    private String nome;
    private String sobre;

    public Ex01NomeSobrenome(String nome, String sobre) {
        this.nome = nome;
        this.sobre = sobre;
    }
    
        public Ex01NomeSobrenome() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 0) {
            this.nome = nome;
        }
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        if (sobre.length() > 0) {
            this.sobre = sobre;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ex01NomeSobrenome{");
        sb.append("nome=").append(nome);
        sb.append(", sobre=").append(sobre);
        sb.append('}');
        return sb.toString();
    }
    
        public String nomeCompleto() {
        StringBuilder sb = new StringBuilder();
        sb.append(nome);
        sb.append(" ");
        sb.append(sobre);
        return sb.toString();
    }

 

}
