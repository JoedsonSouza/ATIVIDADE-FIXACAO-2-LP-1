package Q_01;

public class Paciente {
    private int codigo;
    private String nome, planoSaude, alergia, dataNascimento, tipoSanguineo, sexo;

    //MÉTODO CONSTRUTOR
    public Paciente(int codigo, String nome, String datNasc, String sexo, String planoSaude, String alergia, String tipoSanguineo){
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = datNasc;
        this.sexo = sexo;
        this.planoSaude = planoSaude;
        this.alergia = alergia;
        this.tipoSanguineo = tipoSanguineo;
    }

    //MÉTODOS GETs and Sets

    /* --- codigo --- */
    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    /* --- nome --- */
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    /* --- dataNascimento --- */
    public String getData(){
        return dataNascimento;
    }

    public void setData(String data){
        this.dataNascimento = data;
    }

    /* --- sexo --- */
    public String getSexo(){
        return sexo;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    /* --- planoSaude --- */
    public String getPlano(){
        return planoSaude;
    }

    public void setPlano(String plano){
        this.planoSaude = plano;
    }

    /* --- alergia --- */
    public String getAlergia(){
        return alergia;
    }

    public void setAlergia(String alergia){
        this.alergia = alergia;
    }

    /* --- tipoSanguineo --- */
    public String getTipoSang(){
        return tipoSanguineo;
    }

    public void setTipoSang(String sang){
        this.tipoSanguineo = sang;
    }

    //Imprimir dados do Objeto
    public void mostPaciente(){
        System.out.println("DADOS DO PACIENTE: ");
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Data de Nascimento: " + this.getData());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Plano de Saúde: " + this.getPlano());
        System.out.println("Alergia: " + this.getAlergia());
        System.out.println("Tipo sanguíneo: " + this.getTipoSang());
    }

    //Modificar dados pai/mãe
    public void setPaiMae(int codigo, String nome, String datNasc, String sexo, String planoSaude, String alergia, String tipoSanguineo){
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = datNasc;
        this.sexo = sexo;
        this.planoSaude = planoSaude;
        this.alergia = alergia;
        this.tipoSanguineo = tipoSanguineo;
    }

    //Imprimir dados da Mãe ou Pai
    public void mostPaiouMae(){
        System.out.println("DADOS DO/DA PAI/MÃE: ");
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Data de Nascimento: " + this.getData());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Plano de Saúde: " + this.getPlano());
        System.out.println("Alergia: " + this.getAlergia());
        System.out.println("Tipo sanguíneo: " + this.getTipoSang());
    }

}
