package gg.corz;

import java.util.List;

public record lIiliiIliIiliiIl(long stand, String material, String face, List<liIIIiiiIIIi> targets) {
   private final String iiiIilIlll;
   private final long IiiIilIlll;
   private final String liiIilIlll;
   private final List<liIIIiiiIIIi> IIIlilIlll;

   public long IliIlllilIi() {
      return this.IiiIilIlll;
   }

   public String liiiIIllIl() {
      return this.liiIilIlll;
   }

   public String iIlIlllllill() {
      return this.iiiIilIlll;
   }

   public lIiliiIliIiliiIl(long stand, String material, String face, List<liIIIiiiIIIi> targets) {
      this.IiiIilIlll = stand;
      this.liiIilIlll = material;
      this.iiiIilIlll = face;
      this.IIIlilIlll = targets;
   }

   public List<liIIIiiiIIIi> IilliliilIIi() {
      return this.IIIlilIlll;
   }
}
