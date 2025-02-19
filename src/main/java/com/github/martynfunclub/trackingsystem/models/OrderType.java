package com.github.martynfunclub.trackingsystem.models;

import java.time.LocalTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "order_types")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OrderType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    private DetailType from;

    @ManyToOne
    private DetailType to;

    @Column(name = "max_time", nullable = false)
    private LocalTime maxTime;

    @ManyToMany
    private Set<WorkersPlace> places;

    @OneToMany
    private Set<Order> orders;
}
