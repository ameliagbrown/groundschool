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
import java.util.Date;

/**
 * Chapter.
 */
@Entity
@Data
@Table(name = "chapter")
public class Chapter implements Serializable {

    /**
     * Default SerialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Chapter ID.
     */
    @Id
    @Column(name = "chapter_id")
    private Long chapterId;

    /**
     * ChapterName.
     */
    @Column(name = "chapter_name")
    private String chapterName;

    /**
     * Group ID.
     */
    @Column(name = "group_id")
    private Long groupId;

    /**
     * Sort By.
     */
    @Column(name = "sort_by")
    private Long sortBy;

    /**
     * Last Modified.
     */
    @Column(name = "last_modified")
    private Date lastModified;

}