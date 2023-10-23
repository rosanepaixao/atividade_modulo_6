import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
       // instanciar alunos;
        Aluno lucas = new Aluno("Lucas");
        Aluno pedro = new Aluno("Pedro");
        Aluno rosane = new Aluno("Rosane");
        Aluno carla = new Aluno("Carla");
        Aluno gabriel = new Aluno("Gabriel");


        List<Aluno> chamada1 = List.of(lucas, pedro,rosane);
        List<Aluno> chamada2 = List.of(lucas, pedro, carla);
        List<Aluno> chamada3 = List.of(lucas,pedro,rosane, carla, gabriel);
        List<Aluno> chamada4 = List.of(pedro, carla, gabriel);


        Presenca presenca1 = new Presenca("01/10/2023", chamada1);
        Presenca presenca2 = new Presenca("02/10/2023", chamada2);
        Presenca presenca3 = new Presenca("03/10/2023", chamada3);
        Presenca presenca4 = new Presenca("04/10/2023", chamada4);


        Map<String, Presenca> presencas = new HashMap<>();
        presencas.put("01/10/2023", presenca1);
        presencas.put("02/10/2023", presenca2);
        presencas.put("03/10/2023", presenca3);
        presencas.put("04/10/2023", presenca4);

        for (String dia : presencas.keySet()){
            List<Aluno> alunos = presencas.get(dia).getAlunos();

            System.out.println(("Precenças do dia" + dia));
            alunos.forEach(aluno -> System.out.print(aluno.getNome() +" ,"));
            System.out.println('\n');

        }




    }
}