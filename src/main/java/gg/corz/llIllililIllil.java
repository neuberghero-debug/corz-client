package gg.corz;

import java.util.List;

public record llIllililIllil(List<String> arrived, List<String> departed) {
   public static final llIllililIllil lliIIIIliiliIIIIli = new llIllililIllil(List.of(), List.of());
   private final List<String> IIiIIIIlilIiIIIIli;
   private final List<String> iIiIIIIliIliIIIIli;

   public boolean IliIlllilIi() {
      return !this.IIiIIIIlilIiIIIIli.isEmpty() || !this.iIiIIIIliIliIIIIli.isEmpty();
   }

   public List<String> liiiIIllIl() {
      return this.IIiIIIIlilIiIIIIli;
   }

   public llIllililIllil(List<String> arrived, List<String> departed) {
      this.IIiIIIIlilIiIIIIli = arrived;
      this.iIiIIIIliIliIIIIli = departed;
   }

   public List<String> iIlIlllllill() {
      return this.iIiIIIIliIliIIIIli;
   }
}
