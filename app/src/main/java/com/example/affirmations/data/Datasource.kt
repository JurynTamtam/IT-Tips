/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.affirmations.data
import com.example.affirmations.R
import com.example.affirmations.model.Tips

/**
 * [Datasource] generates a list of [Tips]
 */
class Datasource() {
    fun loadTips(): List<Tips> {
        return listOf<Tips>(

            Tips(R.string.day1, R.drawable.a1, R.string.description1),
            Tips(R.string.day2, R.drawable.a2, R.string.description2),
            Tips(R.string.day3, R.drawable.a3, R.string.description3),
            Tips(R.string.day4, R.drawable.a4, R.string.description4),
            Tips(R.string.day5, R.drawable.a5, R.string.description5),
            Tips(R.string.day6, R.drawable.a6, R.string.description6),
            Tips(R.string.day7, R.drawable.a7, R.string.description7),
            Tips(R.string.day8, R.drawable.a9, R.string.description8),
            Tips(R.string.day9, R.drawable.a9, R.string.description9),
            Tips(R.string.day10, R.drawable.a9, R.string.description10),
            Tips(R.string.day11, R.drawable.a1, R.string.description11),
            Tips(R.string.day12, R.drawable.a1, R.string.description12),
            Tips(R.string.day13, R.drawable.a1, R.string.description13),
            Tips(R.string.day14, R.drawable.a1, R.string.description14),
            Tips(R.string.day15, R.drawable.a1, R.string.description15),
            Tips(R.string.day16, R.drawable.a1, R.string.description16),
            Tips(R.string.day17, R.drawable.a1, R.string.description17),
            Tips(R.string.day18, R.drawable.a1, R.string.description18),
            Tips(R.string.day19, R.drawable.a1, R.string.description19),
            Tips(R.string.day20, R.drawable.a1, R.string.description20),
            Tips(R.string.day21, R.drawable.a1, R.string.description21),
            Tips(R.string.day22, R.drawable.a1, R.string.description22),
            Tips(R.string.day23, R.drawable.a1, R.string.description23),
            Tips(R.string.day24, R.drawable.a1, R.string.description24),
            Tips(R.string.day25, R.drawable.a1, R.string.description25),
            Tips(R.string.day26, R.drawable.a1, R.string.description26),
            Tips(R.string.day27, R.drawable.a1, R.string.description27),
            Tips(R.string.day28, R.drawable.a1, R.string.description28),
            Tips(R.string.day29, R.drawable.a1, R.string.description29),
            Tips(R.string.day30, R.drawable.a1, R.string.description30),
        )
    }
}
