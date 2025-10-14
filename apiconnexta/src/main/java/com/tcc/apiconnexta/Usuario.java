package com.tcc.apiconnexta;

public class Usuario {

        private String nome;
        private String email;

        // Construtor vazio (obrigatório pro Spring)
        public Usuario() {}

        // Getters e setters
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
}
