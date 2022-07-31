package org.calculator;

import org.springframework.stereotype.Service;

@Service
public interface CalculateDao {
    public int[] getResult();
}
