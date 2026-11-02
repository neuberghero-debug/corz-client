package gg.corz;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class lIlIlIiiIlIlIi {
   public static final int liIiiIIiiiiIiiIIii = 3;
   private final AtomicInteger llliiIIiiilliiIIii;
   static final int IIliiIIiilIliiIIii = 1;
   public static final int ilIiiIIiiIiIiiIIii = 6;
   private final AtomicBoolean iiliiIIiiIIiiiIIii;
   private llIIlillilIIlill lIiiiIIiiiIiiiIIii;
   private final AtomicBoolean IiliiIIiililiiIIii;
   private final AtomicInteger iIliiIIiiIlliiIIii = new AtomicInteger();

   public liIIililiiIIilil lIiiIiIlilli() {
      if (this.iiliiIIiiIIiiiIIii.getAndSet(false)) {
         this.lIiiiIIiiiIiiiIIii = llIIlillilIIlill.IlIIiilill;
         this.iIliiIIiiIlliiIIii.set(0);
         this.llliiIIiiilliiIIii.set(0);
         this.IiliiIIiililiiIIii.set(false);
         return liIIililiiIIilil.iiIliIIlil;
      } else if (this.llliiIIiiilliiIIii.get()
         >= (((-946598112 >>> 25 | -946598112 << 7) - 123 << 25 | (-946598112 >>> 25 | -946598112 << 7) - 123 >>> 7) ^ -778825956)) {
         return this.iliIiiliiiii(llIIlillilIIlill.llIIiilill);
      } else {
         return this.iIliiIIiiIlliiIIii.get() >= (-333361603 * -1205604855 + -93 ^ -834701874)
            ? this.iliIiiliiiii(llIIlillilIIlill.ilIIiilill)
            : liIIililiiIIilil.iiIliIIlil;
      }
   }

   private liIIililiiIIilil iliIiiliiiii(llIIlillilIIlill next) {
      if (this.lIiiiIIiiiIiiiIIii == next) {
         return liIIililiiIIilil.iiIliIIlil;
      } else {
         this.lIiiiIIiiiIiiiIIii = next;
         return next == llIIlillilIIlill.llIIiilill ? liIIililiiIIilil.IIlliIIlil : liIIililiiIIilil.lIlliIIlil;
      }
   }

   public llIIlillilIIlill IilliliilIIi() {
      return this.lIiiiIIiiiIiiiIIii;
   }

   public void iIlIlllllill() {
      this.iiliiIIiiIIiiiIIii.set(true);
   }

   public void IliIlllilIi() {
      this.IiliiIIiililiiIIii.set(true);
      this.iIliiIIiiIlliiIIii.set(0);
      this.llliiIIiiilliiIIii.incrementAndGet();
   }

   public void liiiIIllIl() {
      if (this.IiliiIIiililiiIIii.getAndSet(false)) {
         this.iIliiIIiiIlliiIIii.set(0);
      } else {
         if (this.iIliiIIiiIlliiIIii.incrementAndGet() >= (~(-709249004 >>> 9 | -709249004 << 23) - 29 ^ -174775545)) {
            this.llliiIIiiilliiIIii.set(0);
         }
      }
   }

   public lIlIlIiiIlIlIi() {
      this.llliiIIiiilliiIIii = new AtomicInteger();
      this.IiliiIIiililiiIIii = new AtomicBoolean();
      this.iiliiIIiiIIiiiIIii = new AtomicBoolean();
      this.lIiiiIIiiiIiiiIIii = llIIlillilIIlill.IlIIiilill;
   }
}
