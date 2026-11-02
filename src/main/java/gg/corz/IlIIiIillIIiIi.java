package gg.corz;

import java.util.List;

public record IlIIiIillIIiIi(List<llIiiiililIiiiil> steps, boolean reached, int expanded) {
   private final int lIilllliiiIillllii;
   private final boolean iillllliiIIillllii;
   private final List<llIiiiililIiiiil> Iillllliililllllii;

   public int iIlIlllllill() {
      return this.lIilllliiiIillllii;
   }

   public boolean liiiIIllIl() {
      return this.iillllliiIIillllii;
   }

   public List<llIiiiililIiiiil> IliIlllilIi() {
      return this.Iillllliililllllii;
   }

   public IlIIiIillIIiIi(List<llIiiiililIiiiil> steps, boolean reached, int expanded) {
      this.Iillllliililllllii = steps;
      this.iillllliiIIillllii = reached;
      this.lIilllliiiIillllii = expanded;
   }
}
