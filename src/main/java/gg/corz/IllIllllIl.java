package gg.corz;

import java.util.Locale;

public final class IllIllllIl {
   private int iIIiIIlIlIiIIl;
   private int lIilIIliIilIIl;
   private int liilIIliiilIIl;
   public static final int llllIIlilllIIl = 100;
   public static final int IillIIllillIIl = 200;
   private int IlilIIlllilIIl;
   private int iillIIlIIilIIl = -1073741824;
   private int IIIiIIllIIiIIl;
   private int ililIIlIiilIIl;

   public void iIlIlllllill() {
      this.iillIIlIIilIIl++;
      if (this.lIilIIliIilIIl >= 0) {
         this.lIilIIliIilIIl++;
      }
   }

   public int IIlllIlliIll() {
      return this.IIIiIIllIIiIIl;
   }

   public int iliIiiliiiii(int tick) {
      return tick - this.iillIIlIIilIIl;
   }

   public IllIllllIl() {
      this.lIilIIliIilIIl = -1;
   }

   public String Iilllilliill(int tick) {
      return String.format(
         Locale.ROOT,
         IIillIiliIil<"IIillIiliIil","27MGmubRSVFVVA03S8W9SuG7v9fXV+5Za1+nyDunf9kNpLdKbY0sRlc4G3EMM7nu0pUJ6DJdEnbmXx6AZTjGqMahWCOJLiCIfM8j9wNiVpZ1eMKun4z9TiGEso2UvQPYXw5GmnSxv4CZezee6y/1GdqSIh6yTKYrT33HsYG3K+SCRI4=">(),
         this.iliIiiliiiii(tick),
         this.IlilIIlllilIIl,
         this.ililIIlIiilIIl,
         this.liilIIliiilIIl,
         this.IIIiIIllIIiIIl,
         this.iIIiIIlIlIiIIl
      );
   }

   public static boolean IilliliilIIi(lIIiIIiiIIiIIi type, Iiilillliilill phase) {
      if (type == lIIiIIiiIIiIIi.lIlIiiiliiIlIiiili) {
         return false;
      } else {
         return type == lIIiIIiiIIiIIi.iiIIiiiliIIlIiiili ? phase == Iiilillliilill.IliilIlIilliilIlIi : true;
      }
   }

   public llIiIIIlilIiIIIl lIiiIiIlilli(lIIiIIiiIIiIIi tick, Iiilillliilill phase, int type) {
      if (IilliliilIIi(tick, phase)) {
         this.ililIIlIiilIIl++;
         if (type - this.iillIIlIIilIIl > 100) {
            this.IIIiIIllIIiIIl++;
            return llIiIIIlilIiIIIl.IIiliIllIl;
         } else {
            return llIiIIIlilIiIIIl.iilliIllIl;
         }
      } else {
         if (this.lIilIIliIilIIl < 0) {
            this.lIilIIliIilIIl = type;
         }

         this.liilIIliiilIIl++;
         if (type - this.lIilIIliIilIIl > 200) {
            this.iIIiIIlIlIiIIl++;
            return llIiIIIlilIiIIIl.lIiliIllIl;
         } else {
            return llIiIIIlilIiIIIl.iilliIllIl;
         }
      }
   }

   public int IIIllIIliIIl() {
      return this.liilIIliiilIIl;
   }

   public int IlIlllIlilIl() {
      return this.ililIIlIiilIIl;
   }

   public void liiiIIllIl(int tick) {
      this.iillIIlIIilIIl = tick;
      this.IlilIIlllilIIl++;
   }

   public void IliIlllilIi(int tick) {
      this.iillIIlIIilIIl = tick;
      this.lIilIIliIilIIl = -1;
      this.IlilIIlllilIIl = 0;
      this.ililIIlIiilIIl = 0;
      this.liilIIliiilIIl = 0;
   }

   public int Illlllllilll() {
      return this.iIIiIIlIlIiIIl;
   }

   public int IiIlliIliiIl() {
      return this.IlilIIlllilIIl;
   }
}
