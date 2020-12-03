package app;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
  * 
  *  Em um portal de cursos online, cada usuário possui um código único, representado por
  * um número inteiro.
  *  Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode se
  * matricular em quantos cursos quiser. Assim, o número total de alunos de um instrutor não
  * é simplesmente a soma dos alunos de todos os cursos que ele possui, pois pode haver
  * alunos repetidos em mais de um curso.
  *  O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos.
  *
  **/
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("How many students for course A? ");
        int na = sc.nextInt();
        for (int i = 0; i < na; i++) {
            int id = sc.nextInt();
            a.add(id);
        }

        System.out.println(a.size());

        System.out.print("How many students for course B? ");
        int nb = sc.nextInt();
        for (int i = 0; i < nb; i++) {
            int id = sc.nextInt();
            b.add(id);
        }
        System.out.print("How many students for course C? ");
        int nc = sc.nextInt();
        for (int i = 0; i < nc; i++) {
            int id = sc.nextInt();
            c.add(id);
        }
        Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
        total.addAll(c);
        
        System.out.println("Total students: " + total.size());

        sc.close();
    }
}
