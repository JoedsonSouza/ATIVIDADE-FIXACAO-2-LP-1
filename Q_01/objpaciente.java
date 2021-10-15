package Q_01;
import java.util.Scanner;

public class objpaciente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int codigo;
        String nome, planoSaude, alergia, dataNascimento, tipoSanguineo, sexo, r;

        //Instanciar objeto paciente
        System.out.println("DADOS DO(A) PACIENTE");
        System.out.println("Código: ");
        codigo = scan.nextInt();
        System.out.println("Nome: ");
        nome = scan.next();
        System.out.println("Data de Nascimento: ");
        dataNascimento = scan.next();
        System.out.println("Sexo [F/M]: ");
        sexo = scan.next().toUpperCase();
        System.out.println("Plano de Saúde: ");
        planoSaude = scan.next();
        System.out.println("Possui alergias? [S/N] ");
        r = scan.next().toUpperCase();
        if (r.equals("S")){
            System.out.println("Qual é a alergia do paciente? ");
            alergia = scan.next();
        }else{
            alergia = "Não possui";
        }
        System.out.println("Tipo Sanguíneo: ");
        tipoSanguineo = scan.next();

        Paciente paciente = new Paciente(codigo, nome, dataNascimento, sexo, planoSaude, alergia, tipoSanguineo);
        System.out.println("");
        paciente.mostPaciente();
        System.out.println("");

        //Modificar objeto com dados da mãe ou pai
        System.out.println("DADOS DO(A) PAI(MÃE)");
        System.out.println("Código: ");
        codigo = scan.nextInt();
        System.out.println("Nome: ");
        nome = scan.next();
        System.out.println("Data de Nascimento: ");
        dataNascimento = scan.next();
        System.out.println("Sexo [F/M]: ");
        sexo = scan.next().toUpperCase();
        System.out.println("Plano de Saúde: ");
        planoSaude = scan.next();
        System.out.println("Possui alergias? [S/N] ");
        r = scan.next().toUpperCase();
        if (r.equals("S")){
            System.out.println("Qual é a alergia do paciente? ");
            alergia = scan.next();
        }else{
            alergia = "Não possui";
        }
        System.out.println("Tipo Sanguíneo: ");
        tipoSanguineo = scan.next();

        Paciente paimae = new Paciente(codigo, nome, dataNascimento, sexo, planoSaude, alergia, tipoSanguineo);
        System.out.println("");
        paimae.mostPaiouMae();

        scan.close();

    }
}
