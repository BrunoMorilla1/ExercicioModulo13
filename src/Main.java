import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("João");
        pessoaFisica.setSobrenome("Silva");
        pessoaFisica.setDataNascimento(LocalDate.of(1980, 04, 17));
        pessoaFisica.setCpf("01020304050");
        System.out.println("---Pessoa Fisica---");
        System.out.println("Nome: "+pessoaFisica.getNome() + "\n" + "Sobrenome: "+pessoaFisica.getSobrenome() + "\n" + "Data Nascimento: "+pessoaFisica.getDataNascimento() + "\n" + "CPF: "+pessoaFisica.getCpf()
        );


        PessoaJuritica pessoaJuritica = new PessoaJuritica();
        pessoaJuritica.setNome("Maria");
        pessoaJuritica.setSobrenome("Santos");
        pessoaJuritica.setDataNascimento(LocalDate.of(1992, 02, 16));
        pessoaJuritica.setCNPJ("01.123.00001/00");
        pessoaJuritica.setNomeDaEmpresa("MS");
        System.out.println("---Pessoa Juritica---");
        System.out.println("Nome: "+pessoaJuritica.getNome() + "\n"+ "sobrenome: "+pessoaJuritica.getSobrenome()+ "\n" +"Data Nascimento: " +pessoaJuritica.getDataNascimento() + "\n" +
                           "CNPJ: " +pessoaJuritica.getCNPJ() + "\n"+"Nome da Empresa: "+pessoaJuritica.getNomeDaEmpresa());
    }
}
