package gg.corz;

import java.util.function.LongPredicate;

public record iIIiIlllIlIiIlll(LongPredicate component, boolean componentExact, int feetY, int tick, illilillIililill columnNow, lIlIiIiliIlIiIil clock) {
   private final LongPredicate liIiiIIill;
   private final lIlIiIiliIlIiIil IlliiIIill;
   private final boolean iiIiiIIill;
   private final int lIliiIIill;
   private final illilillIililill iIliiIIill;
   private final int IIliiIIill;

   public int iIlIlllllill() {
      return this.IIliiIIill;
   }

   public iIIiIlllIlIiIlll(LongPredicate component, boolean componentExact, int feetY, int tick, illilillIililill columnNow, lIlIiIiliIlIiIil clock) {
      this.liIiiIIill = component;
      this.iiIiiIIill = componentExact;
      this.IIliiIIill = feetY;
      this.lIliiIIill = tick;
      this.iIliiIIill = columnNow;
      this.IlliiIIill = clock;
   }

   public lIlIiIiliIlIiIil iliIiiliiiii() {
      return this.IlliiIIill;
   }

   public boolean liiiIIllIl() {
      return this.iiIiiIIill;
   }

   public int IilliliilIIi() {
      return this.lIliiIIill;
   }

   public illilillIililill lIiiIiIlilli() {
      return this.iIliiIIill;
   }

   public LongPredicate IliIlllilIi() {
      return this.liIiiIIill;
   }
}
