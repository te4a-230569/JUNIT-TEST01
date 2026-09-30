package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalcTest {
  static Calc calc = null;

  @BeforeAll
  static void テスト前処理() {
    calc = new Calc();
  }

  @Test
  void addテスト_正常() {
    assertEquals(calc.add(1, 3), 4);
    assertThat(calc.add(1, 3))
        .as("加算結果の確認")
        .isEqualTo(4);
  }

  @Test
  void subテスト_正常() {
    assertEquals(calc.sub(13, 5), 8);
    assertThat(calc.sub(13, 5))
        .as("減算結果の確認")
        .isEqualTo(8);
  }

  @Test
  void divテスト_正常() {
    assertEquals(calc.div(56, 8), 7);
    assertThat(calc.div(56, 8))
        .as("除算結果の確認")
        .isEqualTo(7);
  }
  @Test
  void mulテスト_正常() {
    assertEquals(calc.mul(6, 7), 42);
    assertThat(calc.mul(6, 7))
        .as("乗算結果の確認")
        .isEqualTo(42);
  }

  @AfterAll
  static void テスト後処理() {
    calc = null;
  }
}
