package gg.corz;

import java.util.function.LongPredicate;

public final class IlIIllllIIll {
   private long ilIlIiilIiIlIiil = Long.MIN_VALUE;
   private int liIlIiiliiIlIiil;
   private final int IlIlIiilllIlIiil;

   public void iIlIlllllill() {
      this.ilIlIiilIiIlIiil = Long.MIN_VALUE;
      this.liIlIiiliiIlIiil = 0;
   }

   public IlIIllllIIll(int maximum) {
      if (maximum < 1) {
         throw new IllegalArgumentException(iliIiiliiiii<"iliIiiliiiii","kd1sUvQSlB6eGR0biGFg6AfkGKbN80VCvfwg3P8QRlt868o=">());
      } else {
         this.IlIlIiilllIlIiil = maximum;
      }
   }

   public Long IliIlllilIi(LongPredicate eligible) {
      if (this.ilIlIiilIiIlIiil != Long.MIN_VALUE && this.liIlIiiliiIlIiil < this.IlIlIiilllIlIiil && eligible.test(this.ilIlIiilIiIlIiil)) {
         return this.ilIlIiilIiIlIiil;
      } else {
         this.iIlIlllllill();
         return null;
      }
   }

   public void liiiIIllIl(long nextRoot) {
      if (this.ilIlIiilIiIlIiil != nextRoot) {
         this.ilIlIiilIiIlIiil = nextRoot;
         this.liIlIiiliiIlIiil = 0;
      }

      this.liIlIiiliiIlIiil++;
   }

   public long IilliliilIIi() {
      return this.ilIlIiilIiIlIiil;
   }

   public int lIiiIiIlilli() {
      return this.liIlIiiliiIlIiil;
   }
}
