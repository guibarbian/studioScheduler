package com.guibarbian.StudioScheduler.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Table(name="tbl_reherse")
public class Reherse extends Event{
    
    @Column(name = "number_of_mics")
    private Integer numberOfMics;

    @Column(name = "band")
    private String band;
}
