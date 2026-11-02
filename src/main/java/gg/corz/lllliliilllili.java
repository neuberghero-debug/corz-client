package gg.corz;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_437;
import net.minecraft.class_490;
import net.minecraft.class_746;

public final class lllliliilllili {
   public static final int iIiIIIlIIl = 200;
   public static final int IliIIIlIIl = 40;
   public static final int IIiIIIlIIl = 2;
   private boolean IiIlIIlIIl;
   private int iiIlIIlIIl;
   private final Object iliIIIlIIl;
   private final llliliililliliil IiiIIIlIIl = new llliliililliliil();
   private long liiIIIlIIl;
   private int llIlIIlIIl;
   private static final int lliIIIlIIl = 18;
   private boolean iIIlIIlIIl;
   private int IlllIIlIIl;
   private long IillIIlIIl;
   public static final int lilIIIlIIl = 6;
   private int lIIlIIlIIl;
   private int iiiIIIlIIl;
   public static final int iilIIIlIIl = 20;
   private Object iIllIIlIIl;
   private class_437 ilIlIIlIIl;
   private int liIlIIlIIl = -1;
   private boolean IlIlIIlIIl;
   private long IIllIIlIIl = -4611686018427387904L;
   private int llllIIlIIl = -1;
   private boolean IIIlIIlIIl;
   private int illlIIlIIl = -1;
   public static final int lIiIIIlIIl = 200;
   private int lIllIIlIIl;

   public void Ililllililil(class_310 mc) {
      if (mc.field_1724 != null && mc.field_1755 == null) {
         class_490 var2 = new class_490(mc.field_1724);
         mc.method_1507(var2);
         if (mc.field_1755 == var2) {
            this.ilIlIIlIIl = var2;
            this.liIlIIlIIl = -1;
            this.iiIlIIlIIl = 0;
         }
      }
   }

   public void IilliliilIIi() {
      this.IIllIIlIIl = this.liiIIIlIIl;
   }

   public boolean IIlllIlliIll() {
      long var2 = -7447685203843164673L;
      var2 ^= ((long)this.IiIlIIlIIl << 32 ^ var2) & -1L << 32;
      this.IiIlIIlIIl = false;
      return (boolean)((int)(var2 >>> 32));
   }

   public void IlIillIiilIi(class_310 mc) {
      class_437 var2 = this.ilIlIIlIIl;
      this.ilIlIIlIIl = null;
      this.liIlIIlIIl = -1;
      if (var2 != null && mc.field_1724 != null && mc.field_1755 == var2) {
         if (mc.field_1724.field_7512.method_34255().method_7960()) {
            mc.field_1724.method_7346();
         }
      }
   }

   public void IiIiliIiiiIi(Runnable mask, boolean delayMs, int click) {
      this.IIIlIIlIIl = true;
      this.lIIlIIlIIl = 0;
      this.iIIlIIlIIl = false;
      this.IlIlIIlIIl = false;
      this.llIlIIlIIl = iillIliIIilIli.IliIlllilIi(click, ThreadLocalRandom.current().nextDouble());
      lIlIiIliIlIiIl.iIlIlllllill(() -> {
         this.iIIlIIlIIl = true;
         mask.run();
      }, delayMs);
   }

   public void IliIlllilIi() {
      this.iiiIIIlIIl = 0;
      this.IIIlIIlIIl = false;
      this.lIIlIIlIIl = 0;
      this.iIIlIIlIIl = false;
      this.IlIlIIlIIl = false;
      this.llIlIIlIIl = 0;
      this.ilIlIIlIIl = null;
      this.IiIlIIlIIl = false;
      this.liIlIIlIIl = -1;
      this.iiIlIIlIIl = 0;
      this.IIllIIlIIl = -4611686018427387904L;
      this.lIllIIlIIl = 0;
      this.iIllIIlIIl = null;
      this.IlllIIlIIl = 0;
      this.llllIIlIIl = -1;
      this.illlIIlIIl = -1;
      this.IillIIlIIl = -4611686018427387904L;
      this.IiiIIIlIIl.IliIlllilIi();
      lIlillliIlilll.liiiIIllIl(this.iliIIIlIIl);
   }

   public int IIillIiliIil() {
      return this.lIllIIlIIl;
   }

   public boolean IIIilIIiiIIi(class_310 mc) {
      if (this.ilIlIIlIIl == null) {
         return true;
      } else if (mc.field_1724 == null || mc.field_1755 != this.ilIlIIlIIl) {
         this.ilIlIIlIIl = null;
         this.liIlIIlIIl = -1;
         return true;
      } else if (!mc.field_1724.field_7512.method_34255().method_7960()) {
         return false;
      } else if (this.liIlIIlIIl < 0) {
         this.liIlIIlIIl = iillIliIIilIli.liiiIIllIl(ThreadLocalRandom.current().nextDouble());
         return false;
      } else if (this.liIlIIlIIl-- > 0) {
         return false;
      } else {
         this.IlIillIiilIi(mc);
         return true;
      }
   }

   public long iIlIlllllill() {
      return this.liiIIIlIIl;
   }

   public void IIlilIliiIli() {
      this.IlIlIIlIIl = true;
   }

   public lllliliilllili(Object owner) {
      this.IillIIlIIl = -4611686018427387904L;
      this.iliIIIlIIl = owner;
   }

   public boolean Illlllllilll() {
      return this.iiIlIIlIIl > 6;
   }

   public boolean IlIlllIlilIl(int key, class_1799 current) {
      return this.IiiIIIlIIl.iIlIlllllill(key, current);
   }

   public boolean Iilllilliill() {
      return this.ilIlIIlIIl != null;
   }

   public void Iiilliiliiil() {
      this.liIlIIlIIl = -1;
   }

   public IlllIlilllllIlil IiIlliIliiIl(int current, class_1799 key) {
      IlllIlilllllIlil var3 = this.IiiIIIlIIl.IilliliilIIi(current, key, this.liiIIIlIIl);
      if (var3 == IlllIlilllllIlil.llliIIiIil) {
         this.IlllIIlIIl = 200;
      }

      return var3;
   }

   public boolean lIiiIiIlilli() {
      return this.liiIIIlIIl - this.IIllIIlIIl < 20L;
   }

   public boolean liiiIIllIl(class_310 mc) {
      long var4 = 8284524578360425779L;
      if (mc.field_1687 != this.iIllIIlIIl) {
         this.IliIlllilIi();
         this.iIllIIlIIl = mc.field_1687;
      }

      this.liiIIIlIIl++;
      this.lIllIIlIIl++;
      class_746 var2 = mc.field_1724;
      if (var2.field_6235 > 0) {
         this.IIllIIlIIl = this.liiIIIlIIl;
      }

      var4 ^= ((long)var2.method_31548().method_67532() << 32 ^ var4) & -1L << 32;
      if ((int)(var4 >>> 32) != this.llllIIlIIl) {
         this.illlIIlIIl = this.llllIIlIIl;
         this.llllIIlIIl = (int)(var4 >>> 32);
         this.IillIIlIIl = this.liiIIIlIIl;
      }

      this.IiiIIIlIIl.lIiiIiIlilli(this.liiIIIlIIl);
      this.iiIlIIlIIl = mc.field_1755 instanceof class_490 ? this.iiIlIIlIIl + 1 : 0;
      if (this.ilIlIIlIIl != null && mc.field_1755 != this.ilIlIIlIIl) {
         this.ilIlIIlIIl = null;
         this.liIlIIlIIl = -1;
         this.IiIlIIlIIl = true;
      }

      if (this.IIIlIIlIIl) {
         if (this.iIIlIIlIIl) {
            this.IIIlIIlIIl = false;
            if (this.IlIlIIlIIl) {
               this.lIllIIlIIl = 0;
            }

            this.iiiIIIlIIl = this.IlIlIIlIIl ? Math.max(0, this.llIlIIlIIl - 1) : 2;
         } else {
            if (lIlIiIliIlIiIl.Illlllllilll() && ++this.lIIlIIlIIl <= 18) {
               return false;
            }

            this.IIIlIIlIIl = false;
            this.iiiIIIlIIl = 2;
         }
      }

      if (this.IlllIIlIIl > 0) {
         this.IlllIIlIIl--;
         return false;
      } else if (this.iiiIIIlIIl > 0) {
         this.iiiIIIlIIl--;
         return false;
      } else {
         return true;
      }
   }

   public void IIIllIIliIIl(int snapshot, class_1799 key) {
      this.IiiIIIlIIl.liiiIIllIl(snapshot, key, this.liiIIIlIIl);
   }

   public boolean iliIiiliiiii(int hotbar) {
      return hotbar < 0 ? false : hotbar == this.llllIIlIIl || hotbar == this.illlIIlIIl && this.liiIIIlIIl - this.IillIIlIIl < 40L;
   }
}
