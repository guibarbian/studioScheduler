package com.guibarbian.StudioScheduler.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
@Table(name="tbl_recordings")
public class Recording extends Event{

    List<String> instrumentList;

}
