package com.apioscarsmovies.backend.config;

import com.apioscarsmovies.backend.model.MovieOscar;
import com.apioscarsmovies.backend.service.MovieOscarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    @Autowired
    private MovieOscarService movieOscarService;

    @Override
    public void run(String... args) throws Exception {
        // Solo insertar si la colección está vacía
        if (movieOscarService.getAllMovies().isEmpty()) {
            System.out.println("Insertando peliculas ganadoras del Oscar...");

            // Pelicula 1
            // --- Bloque de Inserción Cronológica de Ganadoras del Oscar ---

            MovieOscar movie001 = new MovieOscar();
            movie001.setTitleMovie("Wings");
            movie001.setDirectorMovie("William A. Wellman");
            movie001.setYearMovie(1928);
            movie001.setDurationMovie(144);
            movie001.setActressMovie("Clara Bow");
            movie001.setActorMovie("Charles Rogers");
            movie001.setPosterUrlMovie("https://www.imdb.com/title/tt0018578/");
            movieOscarService.createMovie(movie001);

            MovieOscar movie002 = new MovieOscar();
            movie002.setTitleMovie("The Broadway Melody");
            movie002.setDirectorMovie("Harry Beaumont");
            movie002.setYearMovie(1929);
            movie002.setDurationMovie(100);
            movie002.setActressMovie("Bessie Love");
            movie002.setActorMovie("Charles King");
            movie002.setPosterUrlMovie("https://www.imdb.com/title/tt0019729/");
            movieOscarService.createMovie(movie002);

            MovieOscar movie003 = new MovieOscar();
            movie003.setTitleMovie("All Quiet on the Western Front");
            movie003.setDirectorMovie("Lewis Milestone");
            movie003.setYearMovie(1930);
            movie003.setDurationMovie(136);
            movie003.setActressMovie("Beryl Mercer");
            movie003.setActorMovie("Lew Ayres");
            movie003.setPosterUrlMovie("https://www.imdb.com/title/tt0020633/");
            movieOscarService.createMovie(movie003);

            MovieOscar movie004 = new MovieOscar();
            movie004.setTitleMovie("Cimarron");
            movie004.setDirectorMovie("Wesley Ruggles");
            movie004.setYearMovie(1931);
            movie004.setDurationMovie(123);
            movie004.setActressMovie("Irene Dunne");
            movie004.setActorMovie("Richard Dix");
            movie004.setPosterUrlMovie("https://www.imdb.com/title/tt0021746/");
            movieOscarService.createMovie(movie004);

            MovieOscar movie005 = new MovieOscar();
            movie005.setTitleMovie("Grand Hotel");
            movie005.setDirectorMovie("Edmund Goulding");
            movie005.setYearMovie(1932);
            movie005.setDurationMovie(112);
            movie005.setActressMovie("Greta Garbo");
            movie005.setActorMovie("John Barrymore");
            movie005.setPosterUrlMovie("https://www.imdb.com/title/tt0022958/");
            movieOscarService.createMovie(movie005);

            MovieOscar movie006 = new MovieOscar();
            movie006.setTitleMovie("Cavalcade");
            movie006.setDirectorMovie("Frank Lloyd");
            movie006.setYearMovie(1933);
            movie006.setDurationMovie(112);
            movie006.setActressMovie("Diana Wynyard");
            movie006.setActorMovie("Clive Brook");
            movie006.setPosterUrlMovie("https://www.imdb.com/title/tt0023876/");
            movieOscarService.createMovie(movie006);

            MovieOscar movie007 = new MovieOscar();
            movie007.setTitleMovie("It Happened One Night");
            movie007.setDirectorMovie("Frank Capra");
            movie007.setYearMovie(1934);
            movie007.setDurationMovie(105);
            movie007.setActressMovie("Claudette Colbert");
            movie007.setActorMovie("Clark Gable");
            movie007.setPosterUrlMovie("https://www.imdb.com/title/tt0025316/");
            movieOscarService.createMovie(movie007);

            MovieOscar movie008 = new MovieOscar();
            movie008.setTitleMovie("Mutiny on the Bounty");
            movie008.setDirectorMovie("Frank Lloyd");
            movie008.setYearMovie(1935);
            movie008.setDurationMovie(132);
            movie008.setActressMovie(null);
            movie008.setActorMovie("Charles Laughton");
            movie008.setPosterUrlMovie("https://www.imdb.com/title/tt0026752/");
            movieOscarService.createMovie(movie008);

            MovieOscar movie009 = new MovieOscar();
            movie009.setTitleMovie("The Great Ziegfeld");
            movie009.setDirectorMovie("Robert Z. Leonard");
            movie009.setYearMovie(1936);
            movie009.setDurationMovie(176);
            movie009.setActressMovie("Luise Rainer");
            movie009.setActorMovie("William Powell");
            movie009.setPosterUrlMovie("https://www.imdb.com/title/tt0027698/");
            movieOscarService.createMovie(movie009);

            MovieOscar movie010 = new MovieOscar();
            movie010.setTitleMovie("The Life of Emile Zola");
            movie010.setDirectorMovie("William Dieterle");
            movie010.setYearMovie(1937);
            movie010.setDurationMovie(116);
            movie010.setActressMovie("Gale Sondergaard");
            movie010.setActorMovie("Paul Muni");
            movie010.setPosterUrlMovie("https://www.imdb.com/title/tt0029143/");
            movieOscarService.createMovie(movie010);

            MovieOscar movie011 = new MovieOscar();
            movie011.setTitleMovie("You Can't Take It with You");
            movie011.setDirectorMovie("Frank Capra");
            movie011.setYearMovie(1938);
            movie011.setDurationMovie(126);
            movie011.setActressMovie("Jean Arthur");
            movie011.setActorMovie("James Stewart");
            movie011.setPosterUrlMovie("https://www.imdb.com/title/tt0030993/");
            movieOscarService.createMovie(movie011);

            MovieOscar movie012 = new MovieOscar();
            movie012.setTitleMovie("Gone with the Wind");
            movie012.setDirectorMovie("Victor Fleming");
            movie012.setYearMovie(1939);
            movie012.setDurationMovie(238);
            movie012.setActressMovie("Vivien Leigh");
            movie012.setActorMovie("Clark Gable");
            movie012.setPosterUrlMovie("https://www.imdb.com/title/tt0031381/");
            movieOscarService.createMovie(movie012);

            MovieOscar movie013 = new MovieOscar();
            movie013.setTitleMovie("Rebecca");
            movie013.setDirectorMovie("Alfred Hitchcock");
            movie013.setYearMovie(1940);
            movie013.setDurationMovie(130);
            movie013.setActressMovie("Joan Fontaine");
            movie013.setActorMovie("Laurence Olivier");
            movie013.setPosterUrlMovie("https://www.imdb.com/title/tt0032976/");
            movieOscarService.createMovie(movie013);

            MovieOscar movie014 = new MovieOscar();
            movie014.setTitleMovie("How Green Was My Valley");
            movie014.setDirectorMovie("John Ford");
            movie014.setYearMovie(1941);
            movie014.setDurationMovie(118);
            movie014.setActressMovie("Maureen O'Hara");
            movie014.setActorMovie("Walter Pidgeon");
            movie014.setPosterUrlMovie("https://www.imdb.com/title/tt0033729/");
            movieOscarService.createMovie(movie014);

            MovieOscar movie015 = new MovieOscar();
            movie015.setTitleMovie("Mrs. Miniver");
            movie015.setDirectorMovie("William Wyler");
            movie015.setYearMovie(1942);
            movie015.setDurationMovie(134);
            movie015.setActressMovie("Greer Garson");
            movie015.setActorMovie("Walter Pidgeon");
            movie015.setPosterUrlMovie("https://www.imdb.com/title/tt0035093/");
            movieOscarService.createMovie(movie015);

            MovieOscar movie016 = new MovieOscar();
            movie016.setTitleMovie("Casablanca");
            movie016.setDirectorMovie("Michael Curtiz");
            movie016.setYearMovie(1943);
            movie016.setDurationMovie(102);
            movie016.setActressMovie("Ingrid Bergman");
            movie016.setActorMovie("Humphrey Bogart");
            movie016.setPosterUrlMovie("https://www.imdb.com/title/tt0034583/");
            movieOscarService.createMovie(movie016);

            MovieOscar movie017 = new MovieOscar();
            movie017.setTitleMovie("Going My Way");
            movie017.setDirectorMovie("Leo McCarey");
            movie017.setYearMovie(1944);
            movie017.setDurationMovie(126);
            movie017.setActressMovie("Rise Stevens");
            movie017.setActorMovie("Bing Crosby");
            movie017.setPosterUrlMovie("https://www.imdb.com/title/tt0036872/");
            movieOscarService.createMovie(movie017);

            MovieOscar movie018 = new MovieOscar();
            movie018.setTitleMovie("The Lost Weekend");
            movie018.setDirectorMovie("Billy Wilder");
            movie018.setYearMovie(1945);
            movie018.setDurationMovie(101);
            movie018.setActressMovie("Jane Wyman");
            movie018.setActorMovie("Ray Milland");
            movie018.setPosterUrlMovie("https://www.imdb.com/title/tt0037884/");
            movieOscarService.createMovie(movie018);

            MovieOscar movie019 = new MovieOscar();
            movie019.setTitleMovie("The Best Years of Our Lives");
            movie019.setDirectorMovie("William Wyler");
            movie019.setYearMovie(1946);
            movie019.setDurationMovie(170);
            movie019.setActressMovie("Myrna Loy");
            movie019.setActorMovie("Fredric March");
            movie019.setPosterUrlMovie("https://www.imdb.com/title/tt0038351/");
            movieOscarService.createMovie(movie019);

            MovieOscar movie020 = new MovieOscar();
            movie020.setTitleMovie("Gentleman's Agreement");
            movie020.setDirectorMovie("Elia Kazan");
            movie020.setYearMovie(1947);
            movie020.setDurationMovie(118);
            movie020.setActressMovie("Dorothy McGuire");
            movie020.setActorMovie("Gregory Peck");
            movie020.setPosterUrlMovie("https://www.imdb.com/title/tt0039416/");
            movieOscarService.createMovie(movie020);

            MovieOscar movie021 = new MovieOscar();
            movie021.setTitleMovie("Hamlet");
            movie021.setDirectorMovie("Laurence Olivier");
            movie021.setYearMovie(1948);
            movie021.setDurationMovie(155);
            movie021.setActressMovie("Jean Simmons");
            movie021.setActorMovie("Laurence Olivier");
            movie021.setPosterUrlMovie("https://www.imdb.com/title/tt0040416/");
            movieOscarService.createMovie(movie021);

            MovieOscar movie022 = new MovieOscar();
            movie022.setTitleMovie("All the King's Men");
            movie022.setDirectorMovie("Robert Rossen");
            movie022.setYearMovie(1949);
            movie022.setDurationMovie(110);
            movie022.setActressMovie("Mercedes McCambridge");
            movie022.setActorMovie("Broderick Crawford");
            movie022.setPosterUrlMovie("https://www.imdb.com/title/tt0041113/");
            movieOscarService.createMovie(movie022);

            MovieOscar movie023 = new MovieOscar();
            movie023.setTitleMovie("All About Eve");
            movie023.setDirectorMovie("Joseph L. Mankiewicz");
            movie023.setYearMovie(1950);
            movie023.setDurationMovie(138);
            movie023.setActressMovie("Bette Davis");
            movie023.setActorMovie("Gary Merrill");
            movie023.setPosterUrlMovie("https://www.imdb.com/title/tt0042192/");
            movieOscarService.createMovie(movie023);

            MovieOscar movie024 = new MovieOscar();
            movie024.setTitleMovie("An American in Paris");
            movie024.setDirectorMovie("Vincente Minnelli");
            movie024.setYearMovie(1951);
            movie024.setDurationMovie(113);
            movie024.setActressMovie("Leslie Caron");
            movie024.setActorMovie("Gene Kelly");
            movie024.setPosterUrlMovie("https://www.imdb.com/title/tt0043275/");
            movieOscarService.createMovie(movie024);

            MovieOscar movie025 = new MovieOscar();
            movie025.setTitleMovie("The Greatest Show on Earth");
            movie025.setDirectorMovie("Cecil B. DeMille");
            movie025.setYearMovie(1952);
            movie025.setDurationMovie(152);
            movie025.setActressMovie("Betty Hutton");
            movie025.setActorMovie("Charlton Heston");
            movie025.setPosterUrlMovie("https://www.imdb.com/title/tt0044672/");
            movieOscarService.createMovie(movie025);

            MovieOscar movie026 = new MovieOscar();
            movie026.setTitleMovie("From Here to Eternity");
            movie026.setDirectorMovie("Fred Zinnemann");
            movie026.setYearMovie(1953);
            movie026.setDurationMovie(118);
            movie026.setActressMovie("Deborah Kerr");
            movie026.setActorMovie("Burt Lancaster");
            movie026.setPosterUrlMovie("https://www.imdb.com/title/tt0045793/");
            movieOscarService.createMovie(movie026);

            MovieOscar movie027 = new MovieOscar();
            movie027.setTitleMovie("On the Waterfront");
            movie027.setDirectorMovie("Elia Kazan");
            movie027.setYearMovie(1954);
            movie027.setDurationMovie(108);
            movie027.setActressMovie("Eva Marie Saint");
            movie027.setActorMovie("Marlon Brando");
            movie027.setPosterUrlMovie("https://www.imdb.com/title/tt0047296/");
            movieOscarService.createMovie(movie027);

            MovieOscar movie028 = new MovieOscar();
            movie028.setTitleMovie("Marty");
            movie028.setDirectorMovie("Delbert Mann");
            movie028.setYearMovie(1955);
            movie028.setDurationMovie(90);
            movie028.setActressMovie("Betsy Blair");
            movie028.setActorMovie("Ernest Borgnine");
            movie028.setPosterUrlMovie("https://www.imdb.com/title/tt0048356/");
            movieOscarService.createMovie(movie028);

            MovieOscar movie029 = new MovieOscar();
            movie029.setTitleMovie("Around the World in 80 Days");
            movie029.setDirectorMovie("Michael Anderson");
            movie029.setYearMovie(1956);
            movie029.setDurationMovie(175);
            movie029.setActressMovie("Shirley MacLaine");
            movie029.setActorMovie("David Niven");
            movie029.setPosterUrlMovie("https://www.imdb.com/title/tt0048960/");
            movieOscarService.createMovie(movie029);

            MovieOscar movie030 = new MovieOscar();
            movie030.setTitleMovie("The Bridge on the River Kwai");
            movie030.setDirectorMovie("David Lean");
            movie030.setYearMovie(1957);
            movie030.setDurationMovie(161);
            movie030.setActressMovie(null);
            movie030.setActorMovie("Alec Guinness");
            movie030.setPosterUrlMovie("https://www.imdb.com/title/tt0050212/");
            movieOscarService.createMovie(movie030);

            MovieOscar movie031 = new MovieOscar();
            movie031.setTitleMovie("Gigi");
            movie031.setDirectorMovie("Vincente Minnelli");
            movie031.setYearMovie(1958);
            movie031.setDurationMovie(115);
            movie031.setActressMovie("Leslie Caron");
            movie031.setActorMovie("Maurice Chevalier");
            movie031.setPosterUrlMovie("https://www.imdb.com/title/tt0051658/");
            movieOscarService.createMovie(movie031);

            MovieOscar movie032 = new MovieOscar();
            movie032.setTitleMovie("Ben-Hur");
            movie032.setDirectorMovie("William Wyler");
            movie032.setYearMovie(1959);
            movie032.setDurationMovie(212);
            movie032.setActressMovie("Haya Harareet");
            movie032.setActorMovie("Charlton Heston");
            movie032.setPosterUrlMovie("https://www.imdb.com/title/tt0052618/");
            movieOscarService.createMovie(movie032);

            MovieOscar movie033 = new MovieOscar();
            movie033.setTitleMovie("The Apartment");
            movie033.setDirectorMovie("Billy Wilder");
            movie033.setYearMovie(1960);
            movie033.setDurationMovie(125);
            movie033.setActressMovie("Shirley MacLaine");
            movie033.setActorMovie("Jack Lemmon");
            movie033.setPosterUrlMovie("https://www.imdb.com/title/tt0053604/");
            movieOscarService.createMovie(movie033);

            MovieOscar movie034 = new MovieOscar();
            movie034.setTitleMovie("West Side Story");
            movie034.setDirectorMovie("R. Wise / J. Robbins");
            movie034.setYearMovie(1961);
            movie034.setDurationMovie(153);
            movie034.setActressMovie("Natalie Wood");
            movie034.setActorMovie("Richard Beymer");
            movie034.setPosterUrlMovie("https://www.imdb.com/title/tt0055614/");
            movieOscarService.createMovie(movie034);

            MovieOscar movie035 = new MovieOscar();
            movie035.setTitleMovie("Lawrence of Arabia");
            movie035.setDirectorMovie("David Lean");
            movie035.setYearMovie(1962);
            movie035.setDurationMovie(216);
            movie035.setActressMovie(null);
            movie035.setActorMovie("Peter O'Toole");
            movie035.setPosterUrlMovie("https://www.imdb.com/title/tt0056172/");
            movieOscarService.createMovie(movie035);

            MovieOscar movie036 = new MovieOscar();
            movie036.setTitleMovie("Tom Jones");
            movie036.setDirectorMovie("Tony Richardson");
            movie036.setYearMovie(1963);
            movie036.setDurationMovie(128);
            movie036.setActressMovie("Susannah York");
            movie036.setActorMovie("Albert Finney");
            movie036.setPosterUrlMovie("https://www.imdb.com/title/tt0057596/");
            movieOscarService.createMovie(movie036);

            MovieOscar movie037 = new MovieOscar();
            movie037.setTitleMovie("My Fair Lady");
            movie037.setDirectorMovie("George Cukor");
            movie037.setYearMovie(1964);
            movie037.setDurationMovie(170);
            movie037.setActressMovie("Audrey Hepburn");
            movie037.setActorMovie("Rex Harrison");
            movie037.setPosterUrlMovie("https://www.imdb.com/title/tt0058385/");
            movieOscarService.createMovie(movie037);

            MovieOscar movie038 = new MovieOscar();
            movie038.setTitleMovie("The Sound of Music");
            movie038.setDirectorMovie("Robert Wise");
            movie038.setYearMovie(1965);
            movie038.setDurationMovie(172);
            movie038.setActressMovie("Julie Andrews");
            movie038.setActorMovie("Christopher Plummer");
            movie038.setPosterUrlMovie("https://www.imdb.com/title/tt0059742/");
            movieOscarService.createMovie(movie038);

            MovieOscar movie039 = new MovieOscar();
            movie039.setTitleMovie("A Man for All Seasons");
            movie039.setDirectorMovie("Fred Zinnemann");
            movie039.setYearMovie(1966);
            movie039.setDurationMovie(120);
            movie039.setActressMovie("Wendy Hiller");
            movie039.setActorMovie("Paul Scofield");
            movie039.setPosterUrlMovie("https://www.imdb.com/title/tt0060665/");
            movieOscarService.createMovie(movie039);

            MovieOscar movie040 = new MovieOscar();
            movie040.setTitleMovie("In the Heat of the Night");
            movie040.setDirectorMovie("Norman Jewison");
            movie040.setYearMovie(1967);
            movie040.setDurationMovie(109);
            movie040.setActressMovie("Lee Grant");
            movie040.setActorMovie("Sidney Poitier");
            movie040.setPosterUrlMovie("https://www.imdb.com/title/tt0061819/");
            movieOscarService.createMovie(movie040);

            MovieOscar movie041 = new MovieOscar();
            movie041.setTitleMovie("Oliver!");
            movie041.setDirectorMovie("Carol Reed");
            movie041.setYearMovie(1968);
            movie041.setDurationMovie(153);
            movie041.setActressMovie("Shani Wallis");
            movie041.setActorMovie("Ron Moody");
            movie041.setPosterUrlMovie("https://www.imdb.com/title/tt0063385/");
            movieOscarService.createMovie(movie041);

            MovieOscar movie042 = new MovieOscar();
            movie042.setTitleMovie("Midnight Cowboy");
            movie042.setDirectorMovie("John Schlesinger");
            movie042.setYearMovie(1969);
            movie042.setDurationMovie(113);
            movie042.setActressMovie(null);
            movie042.setActorMovie("Dustin Hoffman");
            movie042.setPosterUrlMovie("https://www.imdb.com/title/tt0064665/");
            movieOscarService.createMovie(movie042);

            MovieOscar movie043 = new MovieOscar();
            movie043.setTitleMovie("Patton");
            movie043.setDirectorMovie("Franklin J. Schaffner");
            movie043.setYearMovie(1970);
            movie043.setDurationMovie(172);
            movie043.setActressMovie(null);
            movie043.setActorMovie("George C. Scott");
            movie043.setPosterUrlMovie("https://www.imdb.com/title/tt0066206/");
            movieOscarService.createMovie(movie043);

            MovieOscar movie044 = new MovieOscar();
            movie044.setTitleMovie("The French Connection");
            movie044.setDirectorMovie("William Friedkin");
            movie044.setYearMovie(1971);
            movie044.setDurationMovie(104);
            movie044.setActressMovie(null);
            movie044.setActorMovie("Gene Hackman");
            movie044.setPosterUrlMovie("https://www.imdb.com/title/tt0067116/");
            movieOscarService.createMovie(movie044);

            MovieOscar movie045 = new MovieOscar();
            movie045.setTitleMovie("The Godfather");
            movie045.setDirectorMovie("Francis Ford Coppola");
            movie045.setYearMovie(1972);
            movie045.setDurationMovie(175);
            movie045.setActressMovie("Diane Keaton");
            movie045.setActorMovie("Marlon Brando");
            movie045.setPosterUrlMovie("https://www.imdb.com/title/tt0068646/");
            movieOscarService.createMovie(movie045);

            MovieOscar movie046 = new MovieOscar();
            movie046.setTitleMovie("The Sting");
            movie046.setDirectorMovie("George Roy Hill");
            movie046.setYearMovie(1973);
            movie046.setDurationMovie(129);
            movie046.setActressMovie(null);
            movie046.setActorMovie("Robert Redford");
            movie046.setPosterUrlMovie("https://www.imdb.com/title/tt0070735/");
            movieOscarService.createMovie(movie046);

            MovieOscar movie047 = new MovieOscar();
            movie047.setTitleMovie("The Godfather Part II");
            movie047.setDirectorMovie("Francis Ford Coppola");
            movie047.setYearMovie(1974);
            movie047.setDurationMovie(202);
            movie047.setActressMovie("Diane Keaton");
            movie047.setActorMovie("Al Pacino");
            movie047.setPosterUrlMovie("https://www.imdb.com/title/tt0071562/");
            movieOscarService.createMovie(movie047);

            MovieOscar movie048 = new MovieOscar();
            movie048.setTitleMovie("One Flew Over the Cuckoo's Nest");
            movie048.setDirectorMovie("Miloš Forman");
            movie048.setYearMovie(1975);
            movie048.setDurationMovie(133);
            movie048.setActressMovie("Louise Fletcher");
            movie048.setActorMovie("Jack Nicholson");
            movie048.setPosterUrlMovie("https://www.imdb.com/title/tt0073486/");
            movieOscarService.createMovie(movie048);

            MovieOscar movie049 = new MovieOscar();
            movie049.setTitleMovie("Rocky");
            movie049.setDirectorMovie("John G. Avildsen");
            movie049.setYearMovie(1976);
            movie049.setDurationMovie(120);
            movie049.setActressMovie("Talia Shire");
            movie049.setActorMovie("Sylvester Stallone");
            movie049.setPosterUrlMovie("https://www.imdb.com/title/tt0075148/");
            movieOscarService.createMovie(movie049);

            MovieOscar movie050 = new MovieOscar();
            movie050.setTitleMovie("Annie Hall");
            movie050.setDirectorMovie("Woody Allen");
            movie050.setYearMovie(1977);
            movie050.setDurationMovie(93);
            movie050.setActressMovie("Diane Keaton");
            movie050.setActorMovie("Woody Allen");
            movie050.setPosterUrlMovie("https://www.imdb.com/title/tt0075686/");
            movieOscarService.createMovie(movie050);

            MovieOscar movie051 = new MovieOscar();
            movie051.setTitleMovie("The Deer Hunter");
            movie051.setDirectorMovie("Michael Cimino");
            movie051.setYearMovie(1978);
            movie051.setDurationMovie(183);
            movie051.setActressMovie("Meryl Streep");
            movie051.setActorMovie("Robert De Niro");
            movie051.setPosterUrlMovie("https://www.imdb.com/title/tt0077416/");
            movieOscarService.createMovie(movie051);

            MovieOscar movie052 = new MovieOscar();
            movie052.setTitleMovie("Kramer vs. Kramer");
            movie052.setDirectorMovie("Robert Benton");
            movie052.setYearMovie(1979);
            movie052.setDurationMovie(105);
            movie052.setActressMovie("Meryl Streep");
            movie052.setActorMovie("Dustin Hoffman");
            movie052.setPosterUrlMovie("https://www.imdb.com/title/tt0079417/");
            movieOscarService.createMovie(movie052);

            MovieOscar movie053 = new MovieOscar();
            movie053.setTitleMovie("Ordinary People");
            movie053.setDirectorMovie("Robert Redford");
            movie053.setYearMovie(1980);
            movie053.setDurationMovie(124);
            movie053.setActressMovie("Mary Tyler Moore");
            movie053.setActorMovie("Donald Sutherland");
            movie053.setPosterUrlMovie("https://www.imdb.com/title/tt0081283/");
            movieOscarService.createMovie(movie053);

            MovieOscar movie054 = new MovieOscar();
            movie054.setTitleMovie("Chariots of Fire");
            movie054.setDirectorMovie("Hugh Hudson");
            movie054.setYearMovie(1981);
            movie054.setDurationMovie(125);
            movie054.setActressMovie("Alice Krige");
            movie054.setActorMovie("Ben Cross");
            movie054.setPosterUrlMovie("https://www.imdb.com/title/tt0082158/");
            movieOscarService.createMovie(movie054);

            MovieOscar movie055 = new MovieOscar();
            movie055.setTitleMovie("Gandhi");
            movie055.setDirectorMovie("Richard Attenborough");
            movie055.setYearMovie(1982);
            movie055.setDurationMovie(191);
            movie055.setActressMovie("Candice Bergen");
            movie055.setActorMovie("Ben Kingsley");
            movie055.setPosterUrlMovie("https://www.imdb.com/title/tt0083987/");
            movieOscarService.createMovie(movie055);

            MovieOscar movie056 = new MovieOscar();
            movie056.setTitleMovie("Terms of Endearment");
            movie056.setDirectorMovie("James L. Brooks");
            movie056.setYearMovie(1983);
            movie056.setDurationMovie(132);
            movie056.setActressMovie("Shirley MacLaine");
            movie056.setActorMovie("Jack Nicholson");
            movie056.setPosterUrlMovie("https://www.imdb.com/title/tt0086425/");
            movieOscarService.createMovie(movie056);

            MovieOscar movie057 = new MovieOscar();
            movie057.setTitleMovie("Amadeus");
            movie057.setDirectorMovie("Miloš Forman");
            movie057.setYearMovie(1984);
            movie057.setDurationMovie(160);
            movie057.setActressMovie("Elizabeth Berridge");
            movie057.setActorMovie("F. Murray Abraham");
            movie057.setPosterUrlMovie("https://www.imdb.com/title/tt0086879/");
            movieOscarService.createMovie(movie057);

            MovieOscar movie058 = new MovieOscar();
            movie058.setTitleMovie("Out of Africa");
            movie058.setDirectorMovie("Sydney Pollack");
            movie058.setYearMovie(1985);
            movie058.setDurationMovie(161);
            movie058.setActressMovie("Meryl Streep");
            movie058.setActorMovie("Robert Redford");
            movie058.setPosterUrlMovie("https://www.imdb.com/title/tt0089755/");
            movieOscarService.createMovie(movie058);

            MovieOscar movie059 = new MovieOscar();
            movie059.setTitleMovie("Platoon");
            movie059.setDirectorMovie("Oliver Stone");
            movie059.setYearMovie(1986);
            movie059.setDurationMovie(120);
            movie059.setActressMovie(null);
            movie059.setActorMovie("Charlie Sheen");
            movie059.setPosterUrlMovie("https://www.imdb.com/title/tt0091763/");
            movieOscarService.createMovie(movie059);

            MovieOscar movie060 = new MovieOscar();
            movie060.setTitleMovie("The Last Emperor");
            movie060.setDirectorMovie("Bernardo Bertolucci");
            movie060.setYearMovie(1987);
            movie060.setDurationMovie(163);
            movie060.setActressMovie("Joan Chen");
            movie060.setActorMovie("John Lone");
            movie060.setPosterUrlMovie("https://www.imdb.com/title/tt0093389/");
            movieOscarService.createMovie(movie060);

            MovieOscar movie061 = new MovieOscar();
            movie061.setTitleMovie("Rain Man");
            movie061.setDirectorMovie("Barry Levinson");
            movie061.setYearMovie(1988);
            movie061.setDurationMovie(133);
            movie061.setActressMovie(null);
            movie061.setActorMovie("Dustin Hoffman");
            movie061.setPosterUrlMovie("https://www.imdb.com/title/tt0095953/");
            movieOscarService.createMovie(movie061);

            MovieOscar movie062 = new MovieOscar();
            movie062.setTitleMovie("Driving Miss Daisy");
            movie062.setDirectorMovie("Bruce Beresford");
            movie062.setYearMovie(1989);
            movie062.setDurationMovie(99);
            movie062.setActressMovie("Jessica Tandy");
            movie062.setActorMovie("Morgan Freeman");
            movie062.setPosterUrlMovie("https://www.imdb.com/title/tt0097239/");
            movieOscarService.createMovie(movie062);

            MovieOscar movie063 = new MovieOscar();
            movie063.setTitleMovie("Dances with Wolves");
            movie063.setDirectorMovie("Kevin Costner");
            movie063.setYearMovie(1990);
            movie063.setDurationMovie(181);
            movie063.setActressMovie("Mary McDonnell");
            movie063.setActorMovie("Kevin Costner");
            movie063.setPosterUrlMovie("https://www.imdb.com/title/tt0099348/");
            movieOscarService.createMovie(movie063);

            MovieOscar movie064 = new MovieOscar();
            movie064.setTitleMovie("The Silence of the Lambs");
            movie064.setDirectorMovie("Jonathan Demme");
            movie064.setYearMovie(1991);
            movie064.setDurationMovie(118);
            movie064.setActressMovie("Jodie Foster");
            movie064.setActorMovie("Anthony Hopkins");
            movie064.setPosterUrlMovie("https://www.imdb.com/title/tt0102926/");
            movieOscarService.createMovie(movie064);

            MovieOscar movie065 = new MovieOscar();
            movie065.setTitleMovie("Unforgiven");
            movie065.setDirectorMovie("Clint Eastwood");
            movie065.setYearMovie(1992);
            movie065.setDurationMovie(130);
            movie065.setActressMovie(null);
            movie065.setActorMovie("Clint Eastwood");
            movie065.setPosterUrlMovie("https://www.imdb.com/title/tt0105695/");
            movieOscarService.createMovie(movie065);

            MovieOscar movie066 = new MovieOscar();
            movie066.setTitleMovie("Schindler's List");
            movie066.setDirectorMovie("Steven Spielberg");
            movie066.setYearMovie(1993);
            movie066.setDurationMovie(195);
            movie066.setActressMovie(null);
            movie066.setActorMovie("Liam Neeson");
            movie066.setPosterUrlMovie("https://www.imdb.com/title/tt0108052/");
            movieOscarService.createMovie(movie066);

            MovieOscar movie067 = new MovieOscar();
            movie067.setTitleMovie("Forrest Gump");
            movie067.setDirectorMovie("Robert Zemeckis");
            movie067.setYearMovie(1994);
            movie067.setDurationMovie(142);
            movie067.setActressMovie("Robin Wright");
            movie067.setActorMovie("Tom Hanks");
            movie067.setPosterUrlMovie("https://www.imdb.com/title/tt0109830/");
            movieOscarService.createMovie(movie067);

            MovieOscar movie068 = new MovieOscar();
            movie068.setTitleMovie("Braveheart");
            movie068.setDirectorMovie("Mel Gibson");
            movie068.setYearMovie(1995);
            movie068.setDurationMovie(177);
            movie068.setActressMovie("Sophie Marceau");
            movie068.setActorMovie("Mel Gibson");
            movie068.setPosterUrlMovie("https://www.imdb.com/title/tt0112573/");
            movieOscarService.createMovie(movie068);

            MovieOscar movie069 = new MovieOscar();
            movie069.setTitleMovie("The English Patient");
            movie069.setDirectorMovie("Anthony Minghella");
            movie069.setYearMovie(1996);
            movie069.setDurationMovie(162);
            movie069.setActressMovie("Kristin Scott Thomas");
            movie069.setActorMovie("Ralph Fiennes");
            movie069.setPosterUrlMovie("https://www.imdb.com/title/tt0116209/");
            movieOscarService.createMovie(movie069);

            MovieOscar movie070 = new MovieOscar();
            movie070.setTitleMovie("Titanic");
            movie070.setDirectorMovie("James Cameron");
            movie070.setYearMovie(1997);
            movie070.setDurationMovie(194);
            movie070.setActressMovie("Kate Winslet");
            movie070.setActorMovie("Leonardo DiCaprio");
            movie070.setPosterUrlMovie("https://www.imdb.com/title/tt0120338/");
            movieOscarService.createMovie(movie070);

            MovieOscar movie071 = new MovieOscar();
            movie071.setTitleMovie("Shakespeare in Love");
            movie071.setDirectorMovie("John Madden");
            movie071.setYearMovie(1998);
            movie071.setDurationMovie(123);
            movie071.setActressMovie("Gwyneth Paltrow");
            movie071.setActorMovie("Joseph Fiennes");
            movie071.setPosterUrlMovie("https://www.imdb.com/title/tt0138097/");
            movieOscarService.createMovie(movie071);

            MovieOscar movie072 = new MovieOscar();
            movie072.setTitleMovie("American Beauty");
            movie072.setDirectorMovie("Sam Mendes");
            movie072.setYearMovie(1999);
            movie072.setDurationMovie(122);
            movie072.setActressMovie("Annette Bening");
            movie072.setActorMovie("Kevin Spacey");
            movie072.setPosterUrlMovie("https://www.imdb.com/title/tt0169547/");
            movieOscarService.createMovie(movie072);

            MovieOscar movie073 = new MovieOscar();
            movie073.setTitleMovie("Gladiator");
            movie073.setDirectorMovie("Ridley Scott");
            movie073.setYearMovie(2000);
            movie073.setDurationMovie(155);
            movie073.setActressMovie("Connie Nielsen");
            movie073.setActorMovie("Russell Crowe");
            movie073.setPosterUrlMovie("https://www.imdb.com/title/tt0172495/");
            movieOscarService.createMovie(movie073);

            MovieOscar movie074 = new MovieOscar();
            movie074.setTitleMovie("A Beautiful Mind");
            movie074.setDirectorMovie("Ron Howard");
            movie074.setYearMovie(2001);
            movie074.setDurationMovie(135);
            movie074.setActressMovie("Jennifer Connelly");
            movie074.setActorMovie("Russell Crowe");
            movie074.setPosterUrlMovie("https://www.imdb.com/title/tt0268978/");
            movieOscarService.createMovie(movie074);

            MovieOscar movie075 = new MovieOscar();
            movie075.setTitleMovie("Chicago");
            movie075.setDirectorMovie("Rob Marshall");
            movie075.setYearMovie(2002);
            movie075.setDurationMovie(113);
            movie075.setActressMovie("Renée Zellweger");
            movie075.setActorMovie("Richard Gere");
            movie075.setPosterUrlMovie("https://www.imdb.com/title/tt0299658/");
            movieOscarService.createMovie(movie075);

            MovieOscar movie076 = new MovieOscar();
            movie076.setTitleMovie("The Lord of the Rings: ROTK");
            movie076.setDirectorMovie("Peter Jackson");
            movie076.setYearMovie(2003);
            movie076.setDurationMovie(201);
            movie076.setActressMovie("Liv Tyler");
            movie076.setActorMovie("Elijah Wood");
            movie076.setPosterUrlMovie("https://www.imdb.com/title/tt0167260/");
            movieOscarService.createMovie(movie076);

            MovieOscar movie077 = new MovieOscar();
            movie077.setTitleMovie("Million Dollar Baby");
            movie077.setDirectorMovie("Clint Eastwood");
            movie077.setYearMovie(2004);
            movie077.setDurationMovie(132);
            movie077.setActressMovie("Hilary Swank");
            movie077.setActorMovie("Clint Eastwood");
            movie077.setPosterUrlMovie("https://www.imdb.com/title/tt0405159/");
            movieOscarService.createMovie(movie077);

            MovieOscar movie078 = new MovieOscar();
            movie078.setTitleMovie("Crash");
            movie078.setDirectorMovie("Paul Haggis");
            movie078.setYearMovie(2005);
            movie078.setDurationMovie(112);
            movie078.setActressMovie("Sandra Bullock");
            movie078.setActorMovie("Don Cheadle");
            movie078.setPosterUrlMovie("https://www.imdb.com/title/tt0375679/");
            movieOscarService.createMovie(movie078);

            MovieOscar movie079 = new MovieOscar();
            movie079.setTitleMovie("The Departed");
            movie079.setDirectorMovie("Martin Scorsese");
            movie079.setYearMovie(2006);
            movie079.setDurationMovie(151);
            movie079.setActressMovie(null);
            movie079.setActorMovie("Leonardo DiCaprio");
            movie079.setPosterUrlMovie("https://www.imdb.com/title/tt0407887/");
            movieOscarService.createMovie(movie079);

            MovieOscar movie080 = new MovieOscar();
            movie080.setTitleMovie("No Country for Old Men");
            movie080.setDirectorMovie("Joel & Ethan Coen");
            movie080.setYearMovie(2007);
            movie080.setDurationMovie(122);
            movie080.setActressMovie(null);
            movie080.setActorMovie("Josh Brolin");
            movie080.setPosterUrlMovie("https://www.imdb.com/title/tt0477348/");
            movieOscarService.createMovie(movie080);

            MovieOscar movie081 = new MovieOscar();
            movie081.setTitleMovie("Slumdog Millionaire");
            movie081.setDirectorMovie("Danny Boyle");
            movie081.setYearMovie(2008);
            movie081.setDurationMovie(120);
            movie081.setActressMovie("Freida Pinto");
            movie081.setActorMovie("Dev Patel");
            movie081.setPosterUrlMovie("https://www.imdb.com/title/tt1010048/");
            movieOscarService.createMovie(movie081);

            MovieOscar movie082 = new MovieOscar();
            movie082.setTitleMovie("The Hurt Locker");
            movie082.setDirectorMovie("Kathryn Bigelow");
            movie082.setYearMovie(2009);
            movie082.setDurationMovie(131);
            movie082.setActressMovie(null);
            movie082.setActorMovie("Jeremy Renner");
            movie082.setPosterUrlMovie("https://www.imdb.com/title/tt0887912/");
            movieOscarService.createMovie(movie082);

            MovieOscar movie083 = new MovieOscar();
            movie083.setTitleMovie("The King's Speech");
            movie083.setDirectorMovie("Tom Hooper");
            movie083.setYearMovie(2010);
            movie083.setDurationMovie(118);
            movie083.setActressMovie("Helena Bonham Carter");
            movie083.setActorMovie("Colin Firth");
            movie083.setPosterUrlMovie("https://www.imdb.com/title/tt1504320/");
            movieOscarService.createMovie(movie083);

            MovieOscar movie084 = new MovieOscar();
            movie084.setTitleMovie("The Artist");
            movie084.setDirectorMovie("Michel Hazanavicius");
            movie084.setYearMovie(2011);
            movie084.setDurationMovie(100);
            movie084.setActressMovie("Bérénice Bejo");
            movie084.setActorMovie("Jean Dujardin");
            movie084.setPosterUrlMovie("https://www.imdb.com/title/tt1655442/");
            movieOscarService.createMovie(movie084);

            MovieOscar movie085 = new MovieOscar();
            movie085.setTitleMovie("Argo");
            movie085.setDirectorMovie("Ben Affleck");
            movie085.setYearMovie(2012);
            movie085.setDurationMovie(120);
            movie085.setActressMovie(null);
            movie085.setActorMovie("Ben Affleck");
            movie085.setPosterUrlMovie("https://www.imdb.com/title/tt1024648/");
            movieOscarService.createMovie(movie085);

            MovieOscar movie086 = new MovieOscar();
            movie086.setTitleMovie("12 Years a Slave");
            movie086.setDirectorMovie("Steve McQueen");
            movie086.setYearMovie(2013);
            movie086.setDurationMovie(134);
            movie086.setActressMovie("Lupita Nyong'o");
            movie086.setActorMovie("Chiwetel Ejiofor");
            movie086.setPosterUrlMovie("https://www.imdb.com/title/tt2024544/");
            movieOscarService.createMovie(movie086);

            MovieOscar movie087 = new MovieOscar();
            movie087.setTitleMovie("Birdman");
            movie087.setDirectorMovie("A. G. Iñárritu");
            movie087.setYearMovie(2014);
            movie087.setDurationMovie(119);
            movie087.setActressMovie("Emma Stone");
            movie087.setActorMovie("Michael Keaton");
            movie087.setPosterUrlMovie("https://www.imdb.com/title/tt2562232/");
            movieOscarService.createMovie(movie087);

            MovieOscar movie088 = new MovieOscar();
            movie088.setTitleMovie("Spotlight");
            movie088.setDirectorMovie("Tom McCarthy");
            movie088.setYearMovie(2015);
            movie088.setDurationMovie(128);
            movie088.setActressMovie("Rachel McAdams");
            movie088.setActorMovie("Mark Ruffalo");
            movie088.setPosterUrlMovie("https://www.imdb.com/title/tt1895587/");
            movieOscarService.createMovie(movie088);

            MovieOscar movie089 = new MovieOscar();
            movie089.setTitleMovie("Moonlight");
            movie089.setDirectorMovie("Barry Jenkins");
            movie089.setYearMovie(2016);
            movie089.setDurationMovie(111);
            movie089.setActressMovie(null);
            movie089.setActorMovie("Trevante Rhodes");
            movie089.setPosterUrlMovie("https://www.imdb.com/title/tt4975722/");
            movieOscarService.createMovie(movie089);

            MovieOscar movie090 = new MovieOscar();
            movie090.setTitleMovie("The Shape of Water");
            movie090.setDirectorMovie("Guillermo del Toro");
            movie090.setYearMovie(2017);
            movie090.setDurationMovie(123);
            movie090.setActressMovie("Sally Hawkins");
            movie090.setActorMovie("Doug Jones");
            movie090.setPosterUrlMovie("https://www.imdb.com/title/tt5580390/");
            movieOscarService.createMovie(movie090);

            MovieOscar movie091 = new MovieOscar();
            movie091.setTitleMovie("Green Book");
            movie091.setDirectorMovie("Peter Farrelly");
            movie091.setYearMovie(2018);
            movie091.setDurationMovie(130);
            movie091.setActressMovie("Linda Cardellini");
            movie091.setActorMovie("Viggo Mortensen");
            movie091.setPosterUrlMovie("https://www.imdb.com/title/tt6966692/");
            movieOscarService.createMovie(movie091);

            MovieOscar movie092 = new MovieOscar();
            movie092.setTitleMovie("Parasite");
            movie092.setDirectorMovie("Bong Joon-ho");
            movie092.setYearMovie(2019);
            movie092.setDurationMovie(132);
            movie092.setActressMovie("Cho Yeo-jeong");
            movie092.setActorMovie("Song Kang-ho");
            movie092.setPosterUrlMovie("https://www.imdb.com/title/tt6751668/");
            movieOscarService.createMovie(movie092);

            MovieOscar movie093 = new MovieOscar();
            movie093.setTitleMovie("Nomadland");
            movie093.setDirectorMovie("Chloé Zhao");
            movie093.setYearMovie(2020);
            movie093.setDurationMovie(107);
            movie093.setActressMovie("Frances McDormand");
            movie093.setActorMovie("David Strathairn");
            movie093.setPosterUrlMovie("https://www.imdb.com/title/tt9770150/");
            movieOscarService.createMovie(movie093);

            MovieOscar movie094 = new MovieOscar();
            movie094.setTitleMovie("CODA");
            movie094.setDirectorMovie("Sian Heder");
            movie094.setYearMovie(2021);
            movie094.setDurationMovie(111);
            movie094.setActressMovie("Emilia Jones");
            movie094.setActorMovie("Troy Kotsur");
            movie094.setPosterUrlMovie("https://www.imdb.com/title/tt10366460/");
            movieOscarService.createMovie(movie094);

            MovieOscar movie095 = new MovieOscar();
            movie095.setTitleMovie("EEAAO");
            movie095.setDirectorMovie("Daniels");
            movie095.setYearMovie(2022);
            movie095.setDurationMovie(139);
            movie095.setActressMovie("Michelle Yeoh");
            movie095.setActorMovie("Ke Huy Quan");
            movie095.setPosterUrlMovie("https://www.imdb.com/title/tt6710474/");
            movieOscarService.createMovie(movie095);

            MovieOscar movie096 = new MovieOscar();
            movie096.setTitleMovie("Oppenheimer");
            movie096.setDirectorMovie("Christopher Nolan");
            movie096.setYearMovie(2023);
            movie096.setDurationMovie(180);
            movie096.setActressMovie("Emily Blunt");
            movie096.setActorMovie("Cillian Murphy");
            movie096.setPosterUrlMovie("https://www.imdb.com/title/tt15398776/");
            movieOscarService.createMovie(movie096);

            MovieOscar movie097 = new MovieOscar();
            movie097.setTitleMovie("Anora");
            movie097.setDirectorMovie("Sean Baker");
            movie097.setYearMovie(2024);
            movie097.setDurationMovie(139);
            movie097.setActressMovie("Mikey Madison");
            movie097.setActorMovie("Mark Eydelshteyn");
            movie097.setPosterUrlMovie("https://www.imdb.com/title/tt30397505/");
            movieOscarService.createMovie(movie097);

            System.out.println("Películas ganadoras a mejor película, insertadas correctamente");
        } else {
            System.out.println("Ya se agregaron películas, ya existían o se presentó una falla");
        }
    }
}
