/*
 *  Copyright (C) 2022 Starfire Aviation, LLC
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.starfireaviation.groundschool.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;

/**
 * QuestionReference.
 */
@Entity
@Data
@Table(name = "question_reference")
public class QuestionReference implements Serializable {

    /**
     * ID.
     */
    @Id
    @Column(name = "id")
    private Long id;

    /**
     * Question ID.
     */
    @Column(name = "question_id")
    private Long questionId;

    /**
     * Ref ID.
     */
    @Column(name = "ref_id")
    private Long refId;

}
