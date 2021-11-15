package com.xpinjection.library.domain;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.asList;

@Data
@RequiredArgsConstructor
public class Expert {
    @NotBlank
    @NonNull
    private String name;
    @NotBlank
    @NonNull
    private String contact;
    @NotEmpty
    private Set<Recommendation> recommendations = new HashSet<>();

    public void addRecommendations(Recommendation... recommendations) {
        this.recommendations.addAll(asList(recommendations));
    }
}
