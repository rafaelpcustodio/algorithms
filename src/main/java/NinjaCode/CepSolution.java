package NinjaCode;

import java.util.*;
import java.util.stream.Collectors;

public class CepSolution {

    public void findRegionsByCep(final List<Cep> cepList) {
        final List<Region> regions = new ArrayList<>();
        final List<Integer> list = new ArrayList<>();

        final Set<String> initialCodes = cepList.stream().map(Cep::getInitialCode).collect(Collectors.toSet());
        regions.stream().filter(region -> initialCodes.stream()
                        .anyMatch(code -> region.getCode().equals(code)))
                        .collect(Collectors.toSet());
    }

    public void findRegionsByCepMap(final List<Cep> cepList) {
        final Map<Region, List<Integer>> map = new HashMap<>();
        final List<Integer> list = new ArrayList<>();
        map.put(new Region(), new ArrayList<>());

    }
}
