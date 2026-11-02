package gg.corz;

import java.util.Collections;
import java.util.LinkedHashSet;

final class iIlIliIlIllIliIl {
   final int liIiiliIll;
   final LinkedHashSet<Long> iIliiliIll;
   llliillilliill IIliiliIll = llliillilliill.iIIIlllIiIlIIlllIi;
   long iiIiiliIll;
   final LinkedHashSet<Long> lIliiliIll = new LinkedHashSet<>();
   final long IiIiiliIll;

   iIlIliIlIllIliIl(long id, long openedTick, int ownerKey) {
      this.iIliiliIll = new LinkedHashSet<>();
      this.IiIiiliIll = id;
      this.iiIiiliIll = openedTick;
      this.liIiiliIll = ownerKey;
   }

   liiililiiiilil liiiIIllIl() {
      return new liiililiiiilil(
         this.IiIiiliIll,
         this.iiIiiliIll,
         this.IIliiliIll,
         this.liIiiliIll,
         Collections.unmodifiableSet(new LinkedHashSet<>(this.lIliiliIll)),
         Collections.unmodifiableSet(new LinkedHashSet<>(this.iIliiliIll))
      );
   }

   boolean IliIlllilIi() {
      return this.IIliiliIll == llliillilliill.iIIIlllIiIlIIlllIi || this.IIliiliIll == llliillilliill.llIIlllIiilIIlllIi;
   }
}
