package gg.corz;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_2338;
import net.minecraft.class_2350.class_2351;

public final class iIiiiIIlIliiiIIl {
   private final int IlllllilIl;
   private final int iiIlllilIl;
   private final int llIlllilIl;
   public final int IIIlllilIl;
   private final int lIllllilIl;
   public final class_2351 lIIlllilIl;
   public final boolean iIIlllilIl;
   private final int illlllilIl;
   private final int lillllilIl;
   private int IlilllilIl;
   private final int IiIlllilIl;
   private final int iillllilIl;
   private final int liIlllilIl;
   public final int iiiIllilIl;
   private int lIilllilIl;
   private final int IIllllilIl;
   private final int IillllilIl;
   private final int llllllilIl;
   public final boolean IlIlllilIl;
   private boolean llilllilIl;
   private final int iIllllilIl;
   private int iIilllilIl;
   private final int IIilllilIl;
   private final int ilIlllilIl;
   private boolean ililllilIl;

   public class_2338 IiIiliIiiiIi() {
      return this.IIlilIliiIli(this.IiIlliIliiIl(), this.Iiilliiliiil(), this.iIlIlllllill());
   }

   public boolean Illillliilli() {
      return this.ililllilIl;
   }

   public void Iiiiliiiiiii() {
      this.iIilllilIl = 0;
      this.IlilllilIl = 0;
      this.llilllilIl = false;
   }

   private static int IIIilIIiiIIi(int v, int lo, int hi) {
      return hi - lo < 2 ? v : Math.max(lo + 1, Math.min(hi - 1, v));
   }

   public int llIIlilIIl() {
      return this.IlllllilIl;
   }

   public boolean Iilllilliill() {
      return this.IIlllIlliIll() == this.IIIlllilIl && this.Illlllllilll() == this.iiiIllilIl;
   }

   public void IIiilIiiiIii() {
      if (!this.llilllilIl) {
         this.IlilllilIl++;
         if (this.IlilllilIl >= this.IIilllilIl) {
            this.IlilllilIl = 0;
            this.iIilllilIl++;
            if (this.iIilllilIl >= this.iillllilIl) {
               this.llilllilIl = true;
            }
         }
      }
   }

   public int liiiIIllIl() {
      return this.IillllilIl - this.lIilllilIl * this.iiiIllilIl;
   }

   public int iiIIlIIlIl() {
      return this.lIilllilIl;
   }

   private int IIIllIIliIIl() {
      return Math.min(this.llllllilIl, this.iliIiiliiiii() + this.IIIlllilIl - 1);
   }

   public boolean Iilililiiili() {
      return this.llilllilIl;
   }

   public class_2338 IIlilIliiIli(int y, int cross, int travel) {
      return this.lIIlllilIl == class_2351.field_11048 ? new class_2338(y, travel, cross) : new class_2338(cross, travel, y);
   }

   public float illIlIilIl() {
      if (this.ililllilIl) {
         return 1.0F;
      } else {
         double var1 = this.llilllilIl
            ? 1.0
            : ((double)this.iIilllilIl + (double)this.IlilllilIl / (double)Math.max(1, this.IIilllilIl)) / (double)Math.max(1, this.iillllilIl);
         return (float)Math.min(1.0, ((double)this.lIilllilIl + var1) / (double)this.lillllilIl);
      }
   }

   public int Iiilliiliiil() {
      long var2 = -1570951281555746079L;
      var2 ^= ((long)this.lIiiIiIlilli() << 32 ^ var2) & -1L << 32;
      return this.IIlllIlliIll() == 1 ? (int)(var2 >>> 32) : IIIilIIiiIIi((int)(var2 >>> 32), this.IlllllilIl, this.llllllilIl);
   }

   public int Illlllllilll() {
      return this.liiiIIllIl() - this.iIlIlllllill() + 1;
   }

   public int lIlIliIlIl() {
      return this.lillllilIl;
   }

   public int iIIIlIlIIl() {
      return this.iIllllilIl;
   }

   public boolean IIiIllIiIl(llilIIIiililIIIi sel) {
      return sel != null && sel.IIIllIIliIIl()
         ? this.llIlllilIl == sel.IlIlllIlilIl()
            && this.ilIlllilIl == sel.IiIlliIliiIl()
            && this.IiIlllilIl == sel.IIlllIlliIll()
            && this.liIlllilIl == sel.Illlllllilll()
            && this.iiIlllilIl == sel.Iilllilliill()
            && this.IIllllilIl == sel.IIillIiliIil()
         : false;
   }

   public int IlIlllIlilIl() {
      long var2 = -425825298314648670L;
      var2 ^= ((long)((this.lIilllilIl * this.iillllilIl + this.iIilllilIl) % 2 == 0 ? 1 : -1) << 32 ^ var2) & -1L << 32;
      return this.IlIlllilIl ? -((int)(var2 >>> 32)) : (int)(var2 >>> 32);
   }

   public class_2338 IlIillIiilIi() {
      long var2 = -3920334120173236362L;
      var2 ^= ((long)(this.IiIlliIliiIl() - this.IlIlllIlilIl()) << 32 ^ var2) & -1L << 32;
      if ((int)(var2 >>> 32) < this.lIllllilIl) {
         var2 ^= ((long)this.lIllllilIl << 32 ^ var2) & -1L << 32;
      } else if ((int)(var2 >>> 32) > this.iIllllilIl) {
         var2 ^= ((long)this.iIllllilIl << 32 ^ var2) & -1L << 32;
      }

      return this.IIlilIliiIli((int)(var2 >>> 32), this.Iiilliiliiil(), this.iIlIlllllill());
   }

   public int IiIlliIliiIl() {
      return this.IlIlllIlilIl() > 0 ? this.lIllllilIl + this.IlilllilIl : this.iIllllilIl - this.IlilllilIl;
   }

   public int lIiiIiIlilli() {
      return Math.min(this.llllllilIl, this.IlllllilIl + this.IIIlllilIl / 2 + this.IilliliilIIi() * this.IIIlllilIl);
   }

   private int IilliliilIIi() {
      long var2 = 6832814731055194575L;
      var2 ^= ((long)(this.lIilllilIl % 2 == 0 != this.iIIlllilIl ? 1 : 0) << 32 ^ var2) & -1L << 32;
      return (int)(var2 >>> 32) != 0 ? this.iIilllilIl : this.iillllilIl - 1 - this.iIilllilIl;
   }

   public int iIlIlllllill() {
      return Math.max(this.illlllilIl, this.liiiIIllIl() - (this.iiiIllilIl - 1));
   }

   private static int IliIlllilIi(int a, int b) {
      return (a + b - 1) / b;
   }

   private int iliIiiliiiii() {
      return Math.max(this.IlllllilIl, this.lIiiIiIlilli() - this.IIIlllilIl / 2);
   }

   public class_2338 Ililllililil() {
      long var2 = -2787426276825503354L;
      var2 ^= ((long)(this.iIlIlllllill() + (this.liiiIIllIl() - this.iIlIlllllill()) / 2) << 32 ^ var2) & -1L << 32;
      return this.IIlilIliiIli(
         this.IiIlliIliiIl(),
         this.Iiilliiliiil(),
         this.Illlllllilll() == 1 ? (int)(var2 >>> 32) : IIIilIIiiIIi((int)(var2 >>> 32), this.illlllilIl, this.IillllilIl)
      );
   }

   public int IIlllIlliIll() {
      return this.IIIllIIliIIl() - this.iliIiiliiiii() + 1;
   }

   public String lilIliilIl() {
      return this.llilllilIl
         ? iIiIlIliIl<"iIiIlIliIl","WG4GQtzN2W+aYRWieKBxVIPe3uFauRO/Dh3QXn7Oag+lUg==">()
            + (this.lIilllilIl + 1)
            + iIiIlIliIl<"iIiIlIliIl","QKsoURjKwfiL1vbd6ME7a3Tp9/W0OZzVH25pgJw=">()
            + this.lillllilIl
            + iIiIlIliIl<"iIiIlIliIl","rWAKf5o4/uhiH92eOAur8hhS+DSXdBp0vzi2uixb2niIQjA+r/XRxeHVRFitwqnHqMM=">()
         : iIiIlIliIl<"iIiIlIliIl","WG4GQtzN2W+aYRWieKBxVIPe3uFauRO/Dh3QXn7Oag+lUg==">()
            + (this.lIilllilIl + 1)
            + iIiIlIliIl<"iIiIlIliIl","QKsoURjKwfiL1vbd6ME7a3Tp9/W0OZzVH25pgJw=">()
            + this.lillllilIl
            + iIiIlIliIl<"iIiIlIliIl","vO5OTMFyMKGSYpzH8iTzD67icMjkSEY3+6BmMpqWbhD9C14v">()
            + (this.IilliliilIIi() + 1)
            + iIiIlIliIl<"iIiIlIliIl","QKsoURjKwfiL1vbd6ME7a3Tp9/W0OZzVH25pgJw=">()
            + this.iillllilIl
            + iIiIlIliIl<"iIiIlIliIl","HPmZQiRmH0ieJm1wdNWQ0U/Uw3tzJNK7Sg7pcktAMOU=">()
            + (this.IlilllilIl + 1)
            + iIiIlIliIl<"iIiIlIliIl","QKsoURjKwfiL1vbd6ME7a3Tp9/W0OZzVH25pgJw=">()
            + this.IIilllilIl
            + iIiIlIliIl<"iIiIlIliIl","ecHYpwrm+yLhGm1fec68udzNsMjEWHpDByA+4ZfkBZVejOV/sw==">()
            + this.IIlllIlliIll()
            + iIiIlIliIl<"iIiIlIliIl","rLQKCnsdcQXBYYOGw+sc7GZyq7WuQObIOSbywMc=">()
            + this.Illlllllilll()
            + iIiIlIliIl<"iIiIlIliIl","ienJeGzPLZbcnc/v01ZApKx0IxswH/RruugHYBo=">()
            + this.IIlllIlliIll() * this.Illlllllilll()
            + iIiIlIliIl<"iIiIlIliIl","cZYvCx7Wgg3h1qaf054Pt2xW6z0rI34GU0/2FhRBP/2smVg+89vfIUhpQw==">()
            + (
               this.lIIlllilIl == class_2351.field_11048
                  ? iIiIlIliIl<"iIiIlIliIl","cmvoW/GyTUWPs9eds28z9yL/g9AEKsM5AexYkAs=">()
                  : iIiIlIliIl<"iIiIlIliIl","K7m2tm5JtKUBnsj6zWOXkYPSFckt8sKj909oOao=">()
            )
            + (
               !this.iIIlllilIl && !this.IlIlllilIl
                  ? ""
                  : iIiIlIliIl<"iIiIlIliIl","ptGd/ZbnTxKic+lPnSlop/S/hxks5rMgY3VpNhLDwbVHOdZrurs4CEcacSzm9q3TJxOAnA==">()
            );
   }

   public int IiIIlliIIl() {
      return this.llllllilIl;
   }

   public List<class_2338> IIillIiliIil() {
      long var6 = -8055705685831795531L;
      long var8 = 8862997477651151473L;
      class_2338 var1 = this.Ililllililil();
      var6 ^= ((long)this.IiIlliIliiIl() << 32 ^ var6) & -1L << 32;
      var6 ^= ((long)(this.lIIlllilIl == class_2351.field_11048 ? var1.method_10260() : var1.method_10263()) ^ var6) & -1L >>> 32;
      var8 ^= ((long)var1.method_10264() << 32 ^ var8) & -1L << 32;
      ArrayList var5 = new ArrayList(9);
      var5.add(this.IIlilIliiIli((int)(var6 >>> 32), (int)var6, (int)(var8 >>> 32)));
      var5.add(this.IIlilIliiIli((int)(var6 >>> 32), (int)var6, (int)(var8 >>> 32) + 1));
      var5.add(this.IIlilIliiIli((int)(var6 >>> 32), (int)var6, (int)(var8 >>> 32) - 1));
      var5.add(this.IIlilIliiIli((int)(var6 >>> 32), (int)var6 - 1, (int)(var8 >>> 32)));
      var5.add(this.IIlilIliiIli((int)(var6 >>> 32), (int)var6 + 1, (int)(var8 >>> 32)));
      var5.add(this.IIlilIliiIli((int)(var6 >>> 32), (int)var6 - 1, (int)(var8 >>> 32) + 1));
      var5.add(this.IIlilIliiIli((int)(var6 >>> 32), (int)var6 + 1, (int)(var8 >>> 32) + 1));
      var5.add(this.IIlilIliiIli((int)(var6 >>> 32), (int)var6 - 1, (int)(var8 >>> 32) - 1));
      var5.add(this.IIlilIliiIli((int)(var6 >>> 32), (int)var6 + 1, (int)(var8 >>> 32) - 1));
      return var5;
   }

   public int IIIIllIIIl() {
      return this.lIllllilIl;
   }

   public int IllIllllIl() {
      return this.iIilllilIl;
   }

   public boolean Iliilliiilii() {
      this.lIilllilIl++;
      if (this.lIilllilIl >= this.lillllilIl) {
         this.ililllilIl = true;
         return false;
      } else {
         this.iIilllilIl = 0;
         this.IlilllilIl = 0;
         this.llilllilIl = false;
         if (!this.Iilllilliill()) {
            this.IIiilIiiiIii();
         }

         return true;
      }
   }

   public iIiiiIIlIliiiIIl(llilIIIiililIIIi layerHeight, int passWidth, int travelMirrored, boolean crossMirrored, boolean sel) {
      this.iiiIllilIl = Math.max(1, passWidth);
      this.IIIlllilIl = Math.max(1, travelMirrored);
      this.iIIlllilIl = crossMirrored;
      this.IlIlllilIl = sel;
      this.llIlllilIl = layerHeight.IlIlllIlilIl();
      this.ilIlllilIl = layerHeight.IiIlliIliiIl();
      this.IiIlllilIl = layerHeight.IIlllIlliIll();
      this.liIlllilIl = layerHeight.Illlllllilll();
      this.iiIlllilIl = layerHeight.Iilllilliill();
      this.IIllllilIl = layerHeight.IIillIiliIil();
      this.lIIlllilIl = layerHeight.Ililllililil() >= layerHeight.IIIilIIiiIIi() ? class_2351.field_11048 : class_2351.field_11051;
      if (this.lIIlllilIl == class_2351.field_11048) {
         this.lIllllilIl = layerHeight.IlIlllIlilIl();
         this.iIllllilIl = layerHeight.Illlllllilll();
         this.IlllllilIl = layerHeight.IIlllIlliIll();
         this.llllllilIl = layerHeight.IIillIiliIil();
      } else {
         this.lIllllilIl = layerHeight.IIlllIlliIll();
         this.iIllllilIl = layerHeight.IIillIiliIil();
         this.IlllllilIl = layerHeight.IlIlllIlilIl();
         this.llllllilIl = layerHeight.Illlllllilll();
      }

      this.illlllilIl = layerHeight.IiIlliIliiIl();
      this.IillllilIl = layerHeight.Iilllilliill();
      this.lillllilIl = IliIlllilIi(this.IillllilIl - this.illlllilIl + 1, this.iiiIllilIl);
      this.iillllilIl = IliIlllilIi(this.llllllilIl - this.IlllllilIl + 1, this.IIIlllilIl);
      this.IIilllilIl = this.iIllllilIl - this.lIllllilIl + 1;
      if (!this.Iilllilliill()) {
         this.IIiilIiiiIii();
      }
   }
}
