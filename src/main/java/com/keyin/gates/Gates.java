package com.keyin.gates;

import javax.persistence.*;

@Entity
public class Gates {
    @Id
    @SequenceGenerator(name = "gates_sequence", sequenceName = "gates_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "gates_sequence")
    private Long id;
    private String name;
    private String terminal;

    public Long getId() { return id; }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }
}
