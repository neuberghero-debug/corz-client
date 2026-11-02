package gg.corz;

import java.util.function.Predicate;
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_746;

public final class lIlIiIIliIlIiIIl {
   private boolean llIiIIilIl;
   private long ilIiIIilIl;
   private final IIllllIlll IIIiIIilIl;
   private int IlIiIIilIl;
   private final illillIlIilillIl lIIiIIilIl;
   private boolean IiIiIIilIl;
   private final liiIIIIiiiiIIIIi iIIiIIilIl = new liiIIIIiiiiIIIIi();

   public lIlIiIIliIlIiIIl(IIllllIlll ledger, illillIlIilillIl gates) {
      this.IlIiIIilIl = -1;
      this.ilIiIIilIl = Long.MIN_VALUE;
      this.IIIiIIilIl = ledger;
      this.lIIiIIilIl = gates;
   }

   public boolean IiIlliIliiIl(int tick, long slot) {
      long var6 = -5111626084150774070L;
      class_746 var4 = class_310.method_1551().field_1724;
      if (var4 != null && tick >= 0 && tick < 9) {
         var6 ^= ((long)var4.method_31548().method_67532() << 32 ^ var6) & -1L << 32;
         if ((int)(var6 >>> 32) == tick) {
            return this.lIIiIIilIl.IlIlllIlilIl(tick);
         } else {
            this.iIIiIIilIl.IilliliilIIi((int)(var6 >>> 32), Iiilliiliiil());
            if (!this.IIlllIlliIll(tick, slot, true, false)) {
               return false;
            } else {
               this.IlIillIiilIi();
               return this.lIIiIIilIl.IlIlllIlilIl(tick);
            }
         }
      } else {
         return false;
      }
   }

   public void liiiIIllIl() {
      this.IlIiIIilIl = -1;
      this.llIiIIilIl = false;
      this.ilIiIIilIl = Long.MIN_VALUE;
      this.IiIiIIilIl = false;
   }

   public long IIIilIIiiIIi() {
      return this.ilIiIIilIl;
   }

   public void iliIiiliiiii(int urgent, boolean slot) {
      if (urgent >= 0 && urgent < 9) {
         if (this.IlIiIIilIl < 0 || !this.llIiIIilIl || slot) {
            this.IlIiIIilIl = urgent;
            this.llIiIIilIl = slot;
         }
      }
   }

   public boolean lIiiIiIlilli(int urgent, boolean slot) {
      class_746 var3 = class_310.method_1551().field_1724;
      if (var3 != null && urgent >= 0 && urgent < 9) {
         if (var3.method_31548().method_67532() == urgent) {
            return this.lIIiIIilIl.IlIlllIlilIl(urgent);
         } else {
            this.iliIiiliiiii(urgent, slot);
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean IIlllIlliIll(int tick, long urgent, boolean restore, boolean slot) {
      long var11 = 6242572339922901918L;
      class_746 var6 = class_310.method_1551().field_1724;
      if (var6 != null && tick >= 0 && tick < 9) {
         var11 ^= ((long)var6.method_31548().method_67532() << 32 ^ var11) & -1L << 32;
         if (tick == (int)(var11 >>> 32)) {
            return false;
         } else if (IIIIilIilIIIilIi.iiiIlIIIll(tick)) {
            return false;
         } else if (!this.IIIiIIilIl.Ililllililil() && this.lIIiIIilIl.IIIllIIliIIl() && liillIlliiillIll.liiiIIllIl(urgent, this.ilIiIIilIl, restore)) {
            this.iIIiIIilIl.iliIiiliiiii((int)(var11 >>> 32));

            try (IlIIiiIillIIiiIi var8 = this.lIIiIIilIl.IIlllIlliIll()) {
               IIiIIIlilIiIIIli.IliIlllilIi(tick);
            }

            this.iIIiIIilIl.IIIllIIliIIl(tick, slot);
            this.ilIiIIilIl = urgent;
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public void Illlllllilll() {
      if (iIIiIlIiIlIiIlIi.IiIlliIliiIl()) {
         iIIiIlIiIlIiIlIi.Iilllilliill();
      }

      this.IiIiIIilIl = false;
   }

   public void IlIlllIlilIl(long tick) {
      long var8 = 8353284031049770144L;
      long var10 = 1270962857707199715L;
      var8 ^= ((long)this.IiIiIIilIl << 32 ^ var8) & -1L << 32;
      this.IiIiIIilIl = false;
      class_746 var4 = class_310.method_1551().field_1724;
      if (var4 == null) {
         this.IlIillIiilIi();
      } else {
         var8 ^= ((long)var4.method_31548().method_67532() ^ var8) & -1L >>> 32;
         this.iIIiIIilIl.IilliliilIIi((int)var8, Iiilliiliiil());
         if (this.IlIiIIilIl < 0 && (int)(var8 >>> 32) != 0) {
            var10 ^= ((long)this.iIIiIIilIl.lIiiIiIlilli((int)var8) << 32 ^ var10) & -1L << 32;
            if ((int)(var10 >>> 32) >= 0) {
               this.IlIiIIilIl = (int)(var10 >>> 32);
               this.llIiIIilIl = false;
            }
         }

         if (this.IlIiIIilIl >= 0) {
            var10 ^= ((long)this.IlIiIIilIl << 32 ^ var10) & -1L << 32;
            var10 ^= ((long)this.llIiIIilIl ^ var10) & -1L >>> 32;
            this.IlIillIiilIi();
            if ((int)(var10 >>> 32) != (int)var8) {
               this.IIlllIlliIll((int)(var10 >>> 32), tick, (boolean)((int)var10), (boolean)((int)(var8 >>> 32)));
            }
         }
      }
   }

   public void iIlIlllllill() {
      class_746 var1 = class_310.method_1551().field_1724;
      if (var1 != null) {
         this.IIIiIIilIl.IIIIllIIIl(var1.method_31548().method_67532());
      }
   }

   public int IIIllIIliIIl() {
      return this.IlIiIIilIl;
   }

   public void IliIlllilIi() {
      this.liiiIIllIl();
      this.iIIiIIilIl.IliIlllilIi();
   }

   private void IlIillIiilIi() {
      this.IlIiIIilIl = -1;
      this.llIiIIilIl = false;
   }

   private static boolean Iiilliiliiil() {
      return IIIIilIilIIIilIi.lIIlliIIll() || IilIIililIIi.IilliliilIIi() || iIIiIlIiIlIiIlIi.IiIlliIliiIl();
   }

   static boolean Ililllililil(boolean botSlot, int remembered, int foreignBusy, boolean selected) {
      return botSlot && remembered >= 0 && !selected && foreignBusy != remembered;
   }

   public void Iilllilliill() {
      class_746 var1 = class_310.method_1551().field_1724;
      if (var1 != null) {
         this.iIIiIIilIl.IilliliilIIi(var1.method_31548().method_67532(), Iiilliiliiil());
      }

      if (this.iIIiIIilIl.liiiIIllIl()) {
         this.IiIiIIilIl = true;
      }
   }

   public int IIillIiliIil() {
      class_746 var1 = class_310.method_1551().field_1724;
      return var1 == null ? -1 : this.iIIiIIilIl.IlIlllIlilIl(var1.method_31548().method_67532(), Iiilliiliiil());
   }

   public int IilliliilIIi(Predicate<class_1799> allowTotemSlots, boolean kind) {
      long var10 = 1520682762837742263L;
      class_746 var3 = class_310.method_1551().field_1724;
      if (var3 != null && allowTotemSlots != null) {
         class_1661 var4 = var3.method_31548();
         boolean[] var5 = new boolean[9];
         boolean[] var6 = new boolean[9];
         boolean[] var7 = new boolean[9];

         for (long var12 = var10 ^ (0L ^ var10) & -1L << 32; (int)(var12 >>> 32) < 9; var12 += 4294967296L) {
            class_1799 var9 = var4.method_5438((int)(var12 >>> 32));
            var5[(int)(var12 >>> 32)] = var9 != null && allowTotemSlots.test(var9);
            var6[(int)(var12 >>> 32)] = IIIIilIilIIIilIi.ilIllIiIll((int)(var12 >>> 32));
            var7[(int)(var12 >>> 32)] = IIIIilIilIIIilIi.iiiIlIIIll((int)(var12 >>> 32));
         }

         return liillIlliiillIll.IliIlllilIi(var5, var4.method_67532(), IIIIilIilIIIilIi.IlIllllIll(), var6, var7, kind);
      } else {
         return -1;
      }
   }
}
