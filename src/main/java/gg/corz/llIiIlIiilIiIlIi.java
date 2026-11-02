package gg.corz;

import java.util.UUID;

public record llIiIlIiilIiIlIi(UUID id, String name) {
   private final String IIiilIIIIi;
   private final UUID iililIIIIi;

   public UUID IliIlllilIi() {
      return this.iililIIIIi;
   }

   public llIiIlIiilIiIlIi(UUID id, String name) {
      this.iililIIIIi = id;
      this.IIiilIIIIi = name;
   }

   public String liiiIIllIl() {
      return this.IIiilIIIIi;
   }
}
