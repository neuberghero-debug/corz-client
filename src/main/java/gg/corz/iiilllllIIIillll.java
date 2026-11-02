package gg.corz;

import java.util.ArrayList;
import java.util.List;

record iiilllllIIIillll(List<lIiliiliIiliil> added, List<lIiliiliIiliil> removed) {
   private final List<lIiliiliIiliil> IIIIliIill;
   private final List<lIiliiliIiliil> iiiiIiIill;
   static final iiilllllIIIillll lIIIliIill = new iiilllllIIIillll(List.of(), List.of());

   public List<lIiliiliIiliil> IilliliilIIi() {
      return this.iiiiIiIill;
   }

   iiilllllIIIillll IliIlllilIi(List<lIiliiliIiliil> cells) {
      ArrayList var2 = new ArrayList<>(this.iiiiIiIill);
      var2.addAll(cells);
      return new iiilllllIIIillll(List.copyOf(var2), this.IIIIliIill);
   }

   iiilllllIIIillll liiiIIllIl(lIiliiliIiliil c) {
      ArrayList var2 = new ArrayList<>(this.IIIIliIill);
      var2.add(c);
      ArrayList var3 = new ArrayList<>(this.iiiiIiIill);
      var3.remove(c);
      return new iiilllllIIIillll(List.copyOf(var3), List.copyOf(var2));
   }

   public List<lIiliiliIiliil> lIiiIiIlilli() {
      return this.IIIIliIill;
   }

   iiilllllIIIillll(List<lIiliiliIiliil> added, List<lIiliiliIiliil> removed) {
      this.iiiiIiIill = added;
      this.IIIIliIill = removed;
   }

   int iIlIlllllill() {
      return this.iiiiIiIill.size();
   }
}
