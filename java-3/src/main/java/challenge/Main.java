package challenge;

import java.io.*;
import java.math.BigDecimal;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

	int myArray1[10];

	private List<Player> players = new ArrayList<>();

	public Main() throws FileNotFoundException, ParseException {
		File  archieveCSV = new File("src/main/resources/data.csv");
		Scanner scan = new Scanner(archieveCSV);
		scan.nextLine();
		while(scan.hasNext()){
			String str[] = scan.nextLine().split(",");
			players.add(new Player(str[2], str[3], new Integer(str[6]),	str[8],str[14], new Double(str[17]), str[18]));
		}
	}

	// Quantas nacionalidades (coluna `nationality`) diferentes existem no arquivo?
	public int q1() {
		Set<String> nationalities = new HashSet<>();
		players.forEach(player -> nationalities.add(player.getNationality()));
		return nationalities.size();
	}

	// Quantos clubes (coluna `club`) diferentes existem no arquivo?
	// Obs: Existem jogadores sem clube.
	public int q2() {
//		Set<String>clubs = new HashSet<>();
//		players.forEach(player -> clubs.add(player.getClub()));
//		return clubs.size();

		return (int)players.stream()
				.filter(player -> !(player.getClub().isEmpty()))
				.map(Player::getClub)
				.distinct()
				.count();

	}

	// Liste o primeiro nome (coluna `full_name`) dos 20 primeiros jogadores.
	public List<String> q3() {
		List<String> first20 = new ArrayList<>();
		for(int i=0; i < 20; i++){
			first20.add(players.get(i).getFullName());
		}
		return first20;
	}

	// Quem são os top 10 jogadores que possuem as maiores cláusulas de rescisão?
	// (utilize as colunas `full_name` e `eur_release_clause`)
	public List<String> q4() {
		List<String> playersLargerTerminationClausesTop10 = new ArrayList<>();
		Collections.sort(players, (o1, o2) -> o1.getEurReleaseClause().compareTo(o2.getEurReleaseClause()));
		Collections.reverse(players);
		for (int i=0; i < 10; i++){
			playersLargerTerminationClausesTop10.add(players.get(i).getFullName());
		}
		return playersLargerTerminationClausesTop10;
	}

	// Quem são os 10 jogadores mais velhos (use como critério de desempate o campo `eur_wage`)?
	// (utilize as colunas `full_name` e `birth_date`)
	public List<String> q5() {
//		players.forEach(player -> System.out.println(player.getEurWage()));
		Comparator<Player> comparator = Comparator.comparing(Player::getBirthDate)
				.thenComparingDouble(Player::getEurWage);

		return players.stream().sorted(comparator).limit(10)
				.map(Player::getFullName)
				.collect(Collectors.toList());
	}

	// Conte quantos jogadores existem por idade. Para isso, construa um mapa onde as chaves são as idades e os valores a contagem.
	// (utilize a coluna `age`)
	public Map<Integer, Integer> q6() {
		HashMap<Integer, Integer> groupedAges = new HashMap<>();
		players.forEach(player -> {
			if(groupedAges.containsKey(player.getAge())) groupedAges.put(player.getAge(), groupedAges.get(player.getAge()) +1);
			else groupedAges.put(player.getAge(), 1);
		});
		return groupedAges;
	}
}
