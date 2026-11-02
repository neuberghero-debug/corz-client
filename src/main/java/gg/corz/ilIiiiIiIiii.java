package gg.corz;

import java.util.List;

public record ilIiiiIiIiii(List<lIiliiliIiliil> members, List<iIIIliiIlIIlii> blockers, String resolution) {
   private final List<iIIIliiIlIIlii> IiiIIIiIlliiIIIiIl;
   private final List<lIiliiliIiliil> lliIIIiIliliIIIiIl;
   private final String iiiIIIiIlIIIlIIiIl;

   public String iIlIlllllill() {
      return this.iiiIIIiIlIIIlIIiIl;
   }

   public List<iIIIliiIlIIlii> liiiIIllIl() {
      return this.IiiIIIiIlliiIIIiIl;
   }

   public List<lIiliiliIiliil> IliIlllilIi() {
      return this.lliIIIiIliliIIIiIl;
   }

   public ilIiiiIiIiii(List<lIiliiliIiliil> members, List<iIIIliiIlIIlii> blockers, String resolution) {
      this.lliIIIiIliliIIIiIl = members;
      this.IiiIIIiIlliiIIIiIl = blockers;
      this.iiiIIIiIlIIIlIIiIl = resolution;
   }
}
