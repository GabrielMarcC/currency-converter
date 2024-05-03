package com.gabrielm.entities;

import java.util.Map;

public record Currency(Map<String, Double> conversion_rates) {
}
