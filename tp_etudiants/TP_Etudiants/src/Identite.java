import java.util.Objects;

public class Identite {
    /**
     * Identité d'un étudiant : NIP, nom, prénom.
     * Le NIP est unique
     */
        private final String nip;
        private final String nom;
        private final String prenom;

        public Identite(String nip, String nom, String prenom) {
            if (nip == null || nom == null || prenom == null) {
                throw new IllegalArgumentException("NIP, nom et prénom sont obligatoires");
            }
            this.nip = nip;
            this.nom = nom;
            this.prenom = prenom;
        }

        public String getNip() {
            return nip;
        }

        public String getNom() {
            return nom;
        }

        public String getPrenom() {
            return prenom;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Identite)) return false;
            return nip.equals(((Identite) o).nip);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nip);
        }

        @Override
        public String toString() {
            return nom + " " + prenom + " (" + nip + ")";
        }
    }

}
