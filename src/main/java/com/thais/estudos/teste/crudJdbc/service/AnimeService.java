package com.thais.estudos.teste.crudJdbc.service;

import com.thais.estudos.teste.crudJdbc.dominio.Anime;
import com.thais.estudos.teste.crudJdbc.dominio.Producer;
import com.thais.estudos.teste.crudJdbc.repository.AnimeRepository;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class AnimeService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int op) {
        switch (op) {
            case 1:
                findByName();
                break;
            case 2:
                delete();
                break;
            case 3:
                save();
                break;
            case 4:
                update();
                break;
            default:
                throw new IllegalArgumentException("Not a valid option");
        }
    }

    private static void findByName() {
        System.out.println("Type the name or empty to all ");
        String name = SCANNER.nextLine();
        List<Anime> animes = AnimeRepository.findByName(name);
        animes.forEach(p -> System.out.printf("[%d] - %s%n", p.getId(), p.getName()));


    }

    private static void delete() {
        System.out.println("Type the id of the anime you want to delete");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? Y/N");
        String choise = SCANNER.nextLine();
        if ("y".equalsIgnoreCase(choise)) {
            AnimeRepository.delete(id);
        }
    }

    private static void save() {
        System.out.println("Type the name of the anime");
        String name = SCANNER.nextLine();
        System.out.println("Type the number of episodes");
        int number = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Type the id of episodes");
        int producerId = Integer.parseInt(SCANNER.nextLine());
        Anime anime = Anime.builder()
                .name(name)
                .episodes(number)
                .producer(Producer.builder().id(producerId).build())
                .build();
        AnimeRepository.save(anime);
    }

    private static void update() {
        System.out.println("Type the id of the objects you want to update");
        Optional<Anime> animeOptional = AnimeRepository.findById(Integer.parseInt(SCANNER.nextLine()));
        if (animeOptional.isEmpty()) {
            System.out.println("Anime not found");
            return;
        }
        Anime animeFromDb = animeOptional.get();
        System.out.println("Anime found " + animeFromDb);

        System.out.println("Type the new name or enter to keep the name");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? animeFromDb.getName() : name;

        System.out.println("Type the new number od episodes");
        int episodes = Integer.parseInt(SCANNER.nextLine());


        Anime animeToUpdate = Anime.builder()
                .id(animeFromDb.getId())
                .name(name)
                .episodes(episodes)
                .producer(animeFromDb.getProducer())
                .build();

        AnimeRepository.update(animeToUpdate);
    }


}
