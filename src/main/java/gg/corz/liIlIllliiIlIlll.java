package gg.corz;

import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_4969;
import net.minecraft.class_638;
import net.minecraft.class_746;

public final class liIlIllliiIlIlll {
   private boolean iIlilIIill;
   private static final float IiillIIill = 0.5F;
   private long iililIIill;
   private class_2338 ilIilIIill;
   private String IiiilIIill;
   public static final int IlillIIill = 8;
   private int iiIilIIill;
   private final IlIIiIIillIIiIIi iIIilIIill;
   private Iiilllliilll llIilIIill;
   private long lllilIIill;
   private boolean IllilIIill;
   private static final int iiillIIill = 9;
   private class_243 lliilIIill;
   public static final int llillIIill = 10;
   private int lIiilIIill;
   public static final int iIillIIill = 4;
   private static final int ilillIIill = 20;
   private boolean IililIIill;
   private int liIilIIill;
   private int illilIIill;
   private long IliilIIill;
   private boolean lIlilIIill;
   private int IIiilIIill;
   private boolean lililIIill;
   private int IIlilIIill;
   public static final int lIillIIill = 10;
   private iIilIlilIlilIlil IlIilIIill = iIilIlilIlilIlil.lllilIiIil;
   private class_2338 IiIilIIill;
   private final illlllllIillllll lIIilIIill;
   private long iIiilIIill;
   private class_2350 iliilIIill;
   private static final String IIIilIIill = "unsafe without cover";
   private static final int liillIIill = 40;

   public void IIIilIIiiIIi() {
      this.iIIilIIill.IiIlliIliiIl();
      this.IlIilIIill = iIilIlilIlilIlil.lllilIiIil;
      this.llIilIIill = null;
      this.ilIilIIill = null;
      this.IiIilIIill = null;
      this.liIilIIill = -1;
      this.iiIilIIill = -1;
      this.IIlilIIill = -1;
      this.lIlilIIill = false;
      this.iIlilIIill = false;
      this.IllilIIill = false;
      this.IililIIill = false;
      this.lililIIill = false;
      this.iililIIill = Long.MIN_VALUE;
      this.IIiilIIill = 0;
      this.lliilIIill = null;
      this.iliilIIill = null;
      this.IiiilIIill = null;
      this.iIiilIIill = Long.MIN_VALUE;
      this.IliilIIill = Long.MIN_VALUE;
   }

   public String Iiilliiliiil() {
      return this.IiiilIIill;
   }

   static int IIllllIlll(int counts, int[] blocked, boolean[] current) {
      long var5 = -9081490532189540057L;
      if (blocked == null) {
         return 0;
      } else {
         var5 ^= (0L ^ var5) & -1L << 32;

         for (var5 ^= (0L ^ var5) & -1L >>> 32; (int)var5 < blocked.length && (int)var5 < 9; var5 ^= (var5 ^ var5 + (long)1) & -1L >>> 32) {
            if (blocked[(int)var5] > 0 && ((int)var5 == counts || !lllllillll(current, (int)var5))) {
               var5 ^= ((long)((int)(var5 >>> 32) + blocked[(int)var5]) << 32 ^ var5) & -1L << 32;
            }
         }

         return (int)(var5 >>> 32);
      }
   }

   private static boolean[] ilIllIiIll() {
      long var3 = -402887643416520893L;
      boolean[] var0 = new boolean[9];
      var3 ^= ((long)IIIIilIilIIIilIi.IlIllllIll() << 32 ^ var3) & -1L << 32;

      for (long var6 = var3 ^ (0L ^ var3) & -1L >>> 32; (int)var6 < 9; var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32) {
         var0[(int)var6] = (int)var6 == (int)(var6 >>> 32) || IIIIilIilIIIilIi.ilIllIiIll((int)var6) || IIIIilIilIIIilIi.iiiIlIIIll((int)var6);
      }

      return var0;
   }

   private static boolean Ilillllill(class_2680 s) {
      return !s.method_27852(class_2246.field_23152);
   }

   private static boolean lllllillll(boolean[] blocked, int i) {
      return blocked != null && i >= 0 && i < blocked.length && blocked[i];
   }

   private boolean iiIIlIIlIl() {
      return this.lililIIill && this.lIIilIIill.IIillIiliIil() - this.iililIIill <= (long)this.illilIIill;
   }

   public void iliIiiliiiii(boolean on) {
      this.IllilIIill = on;
   }

   private boolean iIiIlIliIl(class_746 player) {
      return Iillllilll(this.IIlilIIill) && player.method_31548().method_5438(this.IIlilIIill).method_31574(class_1802.field_8288)
         || player.method_6079().method_31574(class_1802.field_8288);
   }

   static int liIlliiIll(int counts, int[] blocked, boolean[] current) {
      long var4 = 1484437589009780501L;
      if (blocked == null) {
         return -1;
      } else if (counts >= 0 && counts < blocked.length && blocked[counts] > 0) {
         return counts;
      } else {
         for (long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < blocked.length && (int)(var6 >>> 32) < 9; var6 += 4294967296L) {
            if (blocked[(int)(var6 >>> 32)] > 0 && !lllllillll(current, (int)(var6 >>> 32))) {
               return (int)(var6 >>> 32);
            }
         }

         return -1;
      }
   }

   private lilIillliilIilll IiIiliIiiiIi(class_746 player) {
      if (this.IiIilIIill == null || !lliiIliliiIl.lIiiIiIlilli(this.IiIilIIill)) {
         this.Iliilliiilii(this.IIiilIiiiIii(iIilIlilIlilIlil.IililIiIil));
         return lilIillliilIilll.iiiIlIlill;
      } else if (lliiIliliiIl.IilliliilIIi(this.ilIilIIill) < 0) {
         return this.IIIIllIIIl(ilillIiill<"ilillIiill","PBRIgjgjMWRNWBGoAzQtUPaFPzRhp5uSM68y0W9x2y97MpqVvflD">());
      } else if (!this.lIlIliIlIl() && lIIlliIIll(player, this.iiIilIIill, class_1802.field_8801)) {
         if (!this.IililIIill) {
            if (lliiIliliiIl.IilliliilIIi(this.ilIilIIill) <= 0 && IIllllIlll(this.iiIilIIill, IlIllllIll(player, class_1802.field_8801), ilIllIiIll()) < 2
               || !lliiIliliiIl.iliIiiliiiii(this.IiIilIIill, class_2246.field_10171.method_9564())
               || !iliIiillIiiIiill.IIiilIiiiIii(player.method_33571(), this.lIIilIIill.Iilllilliill(), this.ilIilIIill, this.IiIilIIill, null, null)
               || !this.iIIilIIill.IliIlllilIi(this.IiIilIIill, this.iiIilIIill, class_2246.field_10171.method_9564(), this.ilIilIIill, this.illilIIill)) {
               return this.Iiiiliiiiiii();
            }

            this.IililIIill = true;
         }

         lilIillliilIilll var2 = this.iIIilIIill.iIlIlllllill();
         if (var2 == lilIillliilIilll.IIIllIlill) {
            this.IiIIlliIIl();
         }

         if (var2 == lilIillliilIilll.lIIllIlill) {
            this.Iliilliiilii(this.IIiilIiiiIii(iIilIlilIlilIlil.IililIiIil));
            return lilIillliilIilll.iiiIlIlill;
         } else {
            return var2 == lilIillliilIilll.iIIllIlill ? this.Iiiiliiiiiii() : var2;
         }
      } else {
         return this.Iiiiliiiiiii();
      }
   }

   public void lIiiIiIlilli() {
      this.iIlilIIill = true;
   }

   private boolean lilIliilIl() {
      if (this.llIilIIill != null && this.llIilIIill.iIlIlllllill() != null) {
         class_638 var1 = class_310.method_1551().field_1687;
         return var1 == null || !var1.method_8320(this.llIilIIill.iIlIlllllill()).method_27852(class_2246.field_10171);
      } else {
         return false;
      }
   }

   public liIlIllliiIlIlll(illlllllIillllll host) {
      this.liIilIIill = -1;
      this.iiIilIIill = -1;
      this.IIlilIIill = -1;
      this.iililIIill = Long.MIN_VALUE;
      this.iIiilIIill = Long.MIN_VALUE;
      this.IliilIIill = Long.MIN_VALUE;
      this.lIIilIIill = host;
      this.iIIilIIill = new IlIIiIIillIIiIIi(host, 2, true);
   }

   public boolean IiIlliIliiIl() {
      return this.IlIilIIill == iIilIlilIlilIlil.illilIiIil && this.iIIilIIill.lIiiIiIlilli();
   }

   private boolean lliIliliIl(class_746 player) {
      long var4 = -7155992393190338469L;
      var4 ^= (
            (long)(
                     player.method_31548().method_5438(this.IIlilIIill).method_31574(class_1802.field_8288) && !IIIIilIilIIIilIi.iiiIlIIIll(this.IIlilIIill)
                        ? 1
                        : 0
                  )
                  << 32
               ^ var4
         )
         & -1L << 32;
      var4 ^= ((long)(player.method_6079().method_31574(class_1802.field_8288) && !IIIIilIilIIIilIi.iiiIlIIIll(40) ? 1 : 0) ^ var4) & -1L >>> 32;
      return (int)(var4 >>> 32) != 0 || (int)var4 != 0;
   }

   public boolean IlIlllIlilIl() {
      return this.IlIilIIill == iIilIlilIlilIlil.illilIiIil && this.iIIilIIill.iliIiiliiiii();
   }

   private void IiIIlliIIl() {
      this.lililIIill = true;
      this.iililIIill = this.lIIilIIill.IIillIiliIil();
   }

   private static boolean lIIlliIIll(class_746 player, int item, class_1792 slot) {
      return Iillllilll(item) && player.method_31548().method_5438(item).method_31574(slot);
   }

   private static int iilllIIill() {
      return Math.round((float)illIllilIilIllil.IiIlliIliiIl() / 50.0F);
   }

   private static int[] IlIllllIll(class_746 player, class_1792 item) {
      long var5 = -45151889138647625L;
      int[] var2 = new int[9];

      for (long var7 = var5 ^ (0L ^ var5) & -1L << 32; (int)(var7 >>> 32) < 9; var7 += 4294967296L) {
         class_1799 var4 = player.method_31548().method_5438((int)(var7 >>> 32));
         var2[(int)(var7 >>> 32)] = var4.method_31574(item) ? var4.method_7947() : 0;
      }

      return var2;
   }

   private lilIillliilIilll Iiiiliiiiiii() {
      this.IiIilIIill = null;
      this.Iliilliiilii(this.IIiilIiiiIii(iIilIlilIlilIlil.IililIiIil));
      return lilIillliilIilll.iiiIlIlill;
   }

   private lilIillliilIilll Illillliilli(class_746 player) {
      long var3 = -6435675727117075923L;
      var3 ^= ((long)lliiIliliiIl.IilliliilIIi(this.ilIilIIill) << 32 ^ var3) & -1L << 32;
      if ((int)(var3 >>> 32) < 0) {
         return this.IIIIllIIIl(ilillIiill<"ilillIiill","PBRIgjgjMWRNWBGoAzQtUPaFPzRhp5uSM68y0W9x2y97MpqVvflD">());
      } else if ((int)(var3 >>> 32) == 0) {
         return this.IIIIllIIIl(ilillIiill<"ilillIiill","tZkaRsJy5DvBjxB8wouxl2UK3YTDa0IlvSlbpjAzKwORRs9Y1Q==">());
      } else if (this.iIlilIIill) {
         if (this.lIIilIIill.IIillIiliIil() > this.lllilIIill) {
            this.iIiilIIill = this.lIIilIIill.IIillIiliIil();
         }

         this.Iliilliiilii(iIilIlilIlilIlil.IIiilIiIil);
         return lilIillliilIilll.iiiIlIlill;
      } else if (this.lIIilIIill.IIillIiliIil() - this.lllilIIill >= 10L) {
         return this.IIIIllIIIl(ilillIiill<"ilillIiill","podqjfx30o95wJO2Bwa0aPFR/BdvQJJg66Nho0SEpCxOccc=">());
      } else {
         this.lIIilIIill.IlIlllIlilIl(this.IIlilIIill);
         this.IiiIlliiIl(player, true);
         return lilIillliilIilll.iiiIlIlill;
      }
   }

   public void Illlllllilll(int slot) {
      if (Iillllilll(slot) && slot != this.IIlilIIill) {
         this.IIlilIIill = slot;
         if (this.IlIilIIill == iIilIlilIlilIlil.IIiilIiIil && this.IililIIill && !this.iiIIlIIlIl()) {
            this.iIIilIIill.IiIlliIliiIl();
            this.IililIIill = false;
         }
      }
   }

   private lilIillliilIilll Iilililiiili(class_746 player) {
      long var6 = 2649121076601408460L;
      var6 ^= ((long)lliiIliliiIl.IilliliilIIi(this.ilIilIIill) << 32 ^ var6) & -1L << 32;
      if ((int)(var6 >>> 32) < 0) {
         return this.lililIIill ? this.iIIIlIlIIl() : this.IIIIllIIIl(ilillIiill<"ilillIiill","PBRIgjgjMWRNWBGoAzQtUPaFPzRhp5uSM68y0W9x2y97MpqVvflD">());
      } else {
         if (!this.iiIIlIIlIl()) {
            if ((int)(var6 >>> 32) == 0) {
               return this.IIIIllIIIl(ilillIiill<"ilillIiill","tZkaRsJy5DvBjxB8wouxl2UK3YTDa0IlvSlbpjAzKwORRs9Y1Q==">());
            }

            if (player.method_6079().method_31574(class_1802.field_8801)) {
               return this.IIIIllIIIl(ilillIiill<"ilillIiill","s6KcCy4cOQtkAAAFLQks1F8IwHtAa/WQvjsY8Q+QmYE0s3n7jgwUf4bdZC7aP0UQ">());
            }

            if (!lliiIliliiIl.IlIillIiilIi(player.method_31548().method_5438(this.IIlilIIill))) {
               return this.IIIIllIIIl(ilillIiill<"ilillIiill","u8e9v9ip0R2rk8MIJ0YR235ynaocvFvVp0SYzdDA05zjBHExdaNMbw==">());
            }

            if (this.lIlIliIlIl()) {
               return this.IIIIllIIIl(ilillIiill<"ilillIiill","EeHCH5vKYcGiLdtxV1F9D5wlldcXXk+KdwaKCnBr4rN5CWPQMJYDSoHjkg8=">());
            }

            if (this.lIIilIIill.IiIlliIliiIl()) {
               this.lIIilIIill.IlIlllIlilIl(this.IIlilIIill);
               this.IiiIlliiIl(player, true);
               return lilIillliilIilll.iiiIlIlill;
            }

            float var3 = this.IllIllllIl(player);
            float var4 = this.illIlIilIl(var3);
            var6 ^= ((long)(!this.llIilIIill.IiIlliIliiIl() && !(var3 >= player.method_6032() + player.method_6067() - 1.0F) ? 0 : 1) ^ var6) & -1L >>> 32;
            if ((int)var6 != 0 && !this.lliIliliIl(player)) {
               if (++this.IIiilIIill > 10) {
                  return this.IIIIllIIIl(ilillIiill<"ilillIiill","DASWObLPrUf+PtxjJM2IBCCAOlduT8cmgefoFJ3qTJlGmNJm">());
               }

               this.lIIilIIill.IlIlllIlilIl(this.IIlilIIill);
               this.IiiIlliiIl(player, true);
               return lilIillliilIilll.iiiIlIlill;
            }

            if (!this.lIIilIIill.IIlllIlliIll(var3, var4, this.llIilIIill.IIlllIlliIll() && iIlllIllll(this.iIiilIIill, this.IliilIIill)) && !this.IllilIIill) {
               return this.IIIIllIIIl(ilillIiill<"ilillIiill","Ge/iYEkxQNfI43CFZoKCz7Ba1awb3oGsUt5L6w5giRkeTw==">());
            }
         }

         if (!this.IililIIill) {
            if (!this.iIIilIIill.liiiIIllIl(this.ilIilIIill, this.IIlilIIill, liIlIllliiIlIlll::Ilillllill, this.illilIIill)) {
               return this.IIIIllIIIl(ilillIiill<"ilillIiill","v4NAdBIlLF2CC4I61bfKU9Djw5ntkfHGwGOjCQdnQlk+KOxKwqCEEEBW">());
            }

            this.IililIIill = true;
         }

         lilIillliilIilll var8 = this.iIIilIIill.iIlIlllllill();
         if (var8 == lilIillliilIilll.IIIllIlill) {
            this.IiIIlliIIl();
         }

         if (var8 == lilIillliilIilll.lIIllIlill) {
            return this.iIIIlIlIIl();
         } else {
            return var8 == lilIillliilIilll.iIIllIlill
               ? this.IIIIllIIIl(this.llIIlilIIl(ilillIiill<"ilillIiill","Tq6LQgq57iFA39RBM3XFsHnkkerStpLjdvvTFs/VeMCmmjmE">()))
               : var8;
         }
      }
   }

   public Iiilllliilll iIlIlllllill() {
      return this.llIilIIill;
   }

   public boolean liiiIIllIl(Iiilllliilll fresh) {
      if (this.IlIilIIill == iIilIlilIlilIlil.iililIiIil && fresh != null && this.ilIilIIill != null && this.ilIilIIill.equals(fresh.liiiIIllIl())) {
         this.llIilIIill = fresh;
         this.IliilIIill = this.lIIilIIill.IIillIiliIil();
         return true;
      } else {
         return false;
      }
   }

   private lilIillliilIilll IlIillIiilIi(class_746 player) {
      if (lliiIliliiIl.IilliliilIIi(this.ilIilIIill) >= 0) {
         this.Iliilliiilii(this.IIiilIiiiIii(iIilIlilIlilIlil.illilIiIil));
         return lilIillliilIilll.iiiIlIlill;
      } else if (this.lIlIliIlIl()) {
         return this.IIIIllIIIl(ilillIiill<"ilillIiill","Tb/Ti5l6pGOwpo2BIeS9dCNl9OkmxpGxsdEYiZsdGfA1/K+uVlpjDgs=">());
      } else if (!this.lililIIill
         && this.lIIilIIill.IIillIiliIil() - this.lllilIIill > (long)(8 + iliIiillIiiIiill.IlIillIiilIi(this.llIilIIill.Ililllililil()))) {
         return this.IIIIllIIIl(ilillIiill<"ilillIiill","sxTNqgkOsw+aVGI2zx6w1dxA57dcNElCqkpu2cILbKjI9bgRjyg0">());
      } else {
         if (!this.IililIIill) {
            if (!lIIlliIIll(player, this.liIilIIill, class_1802.field_23141)) {
               return this.IIIIllIIIl(ilillIiill<"ilillIiill","TtsNHuUYtBhXZOmyI8AQq5NCC7AGEAUA6ebX1WF2e9j5yYi6Tw==">());
            }

            if (!this.iIIilIIill.IliIlllilIi(this.ilIilIIill, this.liIilIIill, class_2246.field_23152.method_9564(), null, this.illilIIill)) {
               return this.IIIIllIIIl(ilillIiill<"ilillIiill","Qs61wCEz69s2tFvdhFMVe3gRO+El/1E7/M9BY+xc0ZoS1OhKpJWO">());
            }

            this.IililIIill = true;
         }

         lilIillliilIilll var2 = this.iIIilIIill.iIlIlllllill();
         if (var2 == lilIillliilIilll.IIIllIlill) {
            this.IiIIlliIIl();
         }

         if (var2 == lilIillliilIilll.lIIllIlill) {
            this.Iliilliiilii(this.IIiilIiiiIii(iIilIlilIlilIlil.illilIiIil));
            return lilIillliilIilll.iiiIlIlill;
         } else {
            return var2 == lilIillliilIilll.iIIllIlill
               ? this.IIIIllIIIl(this.llIIlilIIl(ilillIiill<"ilillIiill","PPnhBEHc8+v22vH2RvjHf7zkMW1BKYyRpejaU8e+1tf+">()))
               : var2;
         }
      }
   }

   private static boolean lIilliIill(class_2680 s) {
      return s.method_27852(class_2246.field_23152) && (Integer)s.method_11654(class_4969.field_23153) > 0;
   }

   static boolean iIlllIllll(long armedExit, long killTick) {
      return armedExit == Long.MIN_VALUE || killTick >= armedExit;
   }

   private float IllIllllIl(class_746 player) {
      float var2 = IiliiIililiiIi.liiiIIllIl(this.ilIilIIill, null, null);
      return iiIiiliIIliili.lIiiIiIlilli(var2, lllIliIlillIliIl.iiiIlIIIll(player));
   }

   private boolean lIlIliIlIl() {
      return this.lIIilIIill.IIillIiliIil() - this.lllilIIill > 20L + 2L * (long)this.illilIIill;
   }

   private lilIillliilIilll iIIIlIlIIl() {
      this.iIIilIIill.IiIlliIliiIl();
      this.IlIilIIill = iIilIlilIlilIlil.lIiilIiIil;
      this.IiiilIIill = null;
      this.IililIIill = false;
      return lilIillliilIilll.lIIllIlill;
   }

   public class_2338 Ililllililil() {
      return this.ilIilIIill;
   }

   public lilIillliilIilll IilliliilIIi() {
      long var6 = 5062008240477647218L;
      if (!this.Iilllilliill()) {
         return lilIillliilIilll.IiiIlIlill;
      } else {
         class_310 var1 = class_310.method_1551();
         class_746 var2 = var1.field_1724;
         if (var2 != null && var1.field_1687 != null) {
            if (!lliiIliliiIl.iIlIlllllill()) {
               return this.IIIIllIIIl(ilillIiill<"ilillIiill","fHMGs4Y9RufvBIT5d3HSW/4/9doIpfKNBd3oyjCdbAnleA==">());
            } else {
               lilIillliilIilll var3 = lilIillliilIilll.iiiIlIlill;
               var6 ^= (0L ^ var6) & -1L << 32;

               while ((int)(var6 >>> 32) < iIilIlilIlilIlil.values().length) {
                  var6 ^= ((long)this.lIiilIIill ^ var6) & -1L >>> 32;

                  var3 = switch (this.IlIilIIill) {
                     case iIiilIiIil -> this.IlIillIiilIi(var2);
                     case lllilIiIil -> this.IiIiliIiiiIi(var2);
                     case IililIiIil -> this.IIlilIliiIli(var2);
                     case lililIiIil -> this.Illillliilli(var2);
                     case lIiilIiIil -> this.Iilililiiili(var2);
                     default -> lilIillliilIilll.IiiIlIlill;
                  };
                  if (this.IlIilIIill == iIilIlilIlilIlil.lIiilIiIil) {
                     return lilIillliilIilll.lIIllIlill;
                  }

                  if (this.IlIilIIill == iIilIlilIlilIlil.iIiilIiIil) {
                     return lilIillliilIilll.iIIllIlill;
                  }

                  if (this.lIiilIIill == (int)var6 || var3 == lilIillliilIilll.IIIllIlill) {
                     return var3;
                  }

                  var6 += 4294967296L;
               }

               return var3;
            }
         } else {
            return this.IIIIllIIIl(ilillIiill<"ilillIiill","Yurb5VwQ/YiLR6AXdZbcQDBO7h/Kgh8Zz6tYqFp3aBmK/m5E">());
         }
      }
   }

   private void IiiIlliiIl(class_746 player, boolean settle) {
      class_243 var3 = player.method_33571();
      double var4 = this.lIIilIIill.Iilllilliill();
      if (this.lliilIIill == null || !this.iiiIlIIIll(this.lliilIIill, this.iliilIIill, var3, var4)) {
         this.lliilIIill = null;
         this.iliilIIill = null;
         float[] var6 = ilIiiIiIii.Ililllililil(var3, class_243.method_24953(this.ilIilIIill));
         class_3965 var7 = IiIiiiilliIiiiil.iIlIlllllill(this.ilIilIIill, var4, var6[0], var6[1]);
         if (var7 != null) {
            this.iliilIIill = var7.method_17780();
            class_243 var8 = lllIliIlillIliIl.illilIilil(this.ilIilIIill, this.iliilIIill);
            this.lliilIIill = this.iiiIlIIIll(var8, this.iliilIIill, var3, var4) ? var8 : var7.method_17784();
         }
      }

      this.lIIilIIill.lIiiIiIlilli(this.lliilIIill != null ? this.lliilIIill : class_243.method_24953(this.ilIilIIill), settle);
   }

   public iIilIlilIlilIlil IIillIiliIil() {
      return this.IlIilIIill;
   }

   public boolean Iilllilliill() {
      return this.IlIilIIill == iIilIlilIlilIlil.illilIiIil
         || this.IlIilIIill == iIilIlilIlilIlil.IililIiIil
         || this.IlIilIIill == iIilIlilIlilIlil.lililIiIil
         || this.IlIilIIill == iIilIlilIlilIlil.iililIiIil
         || this.IlIilIIill == iIilIlilIlilIlil.IIiilIiIil;
   }

   public boolean IliIlllilIi(Iiilllliilll glowSlot, int plan, int detonateSlot, int anchorSlot, boolean holdDetonate) {
      long var9 = -5678277655350170716L;
      if (!this.Iilllilliill() && glowSlot != null && glowSlot.liiiIIllIl() != null) {
         class_310 var6 = class_310.method_1551();
         if (var6.field_1724 == null || var6.field_1687 == null || !lliiIliliiIl.iIlIlllllill()) {
            return false;
         } else if (!Iillllilll(anchorSlot)) {
            return false;
         } else {
            class_2338 var7 = glowSlot.liiiIIllIl().method_10062();
            var9 ^= ((long)lliiIliliiIl.IilliliilIIi(var7) << 32 ^ var9) & -1L << 32;
            if ((int)(var9 >>> 32) >= 0 || lIIlliIIll(var6.field_1724, plan, class_1802.field_23141) && lliiIliliiIl.lIiiIiIlilli(var7)) {
               if ((int)(var9 >>> 32) <= 0 && !lIIlliIIll(var6.field_1724, detonateSlot, class_1802.field_8801)) {
                  return false;
               } else {
                  this.iIIilIIill.IiIlliIliiIl();
                  this.llIilIIill = glowSlot;
                  this.ilIilIIill = var7;
                  this.IiIilIIill = glowSlot.iIlIlllllill() != null && lIIlliIIll(var6.field_1724, detonateSlot, class_1802.field_8801)
                     ? glowSlot.iIlIlllllill().method_10062()
                     : null;
                  this.liIilIIill = plan;
                  this.iiIilIIill = detonateSlot;
                  this.IIlilIIill = anchorSlot;
                  this.lIlilIIill = holdDetonate;
                  this.iIlilIIill = false;
                  this.IllilIIill = false;
                  this.lliilIIill = null;
                  this.iliilIIill = null;
                  this.IiiilIIill = null;
                  this.iIiilIIill = Long.MIN_VALUE;
                  this.IliilIIill = this.lIIilIIill.IIillIiliIil();
                  this.Iliilliiilii(this.IIiilIiiiIii(iIilIlilIlilIlil.lllilIiIil));
                  return true;
               }
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   private String llIIlilIIl(String what) {
      String var2 = this.iIIilIIill.IIlllIlliIll();
      return var2 == null
         ? what + ilillIiill<"ilillIiill","5i74yiUexfXe7QxzYYB9H9Jot+EIyDTjStUeedmgpJ2vibI=">()
         : what + ilillIiill<"ilillIiill","n3Bni7e5tzA/vQeH3LbiBz6V2+8coMTf9nt4dK3m">() + var2;
   }

   private boolean iiiIlIIIll(class_243 point, class_2350 side, class_243 reach, double eye) {
      if (reach.method_1025(point) > eye * eye) {
         return false;
      } else {
         float[] var6 = ilIiiIiIii.Ililllililil(reach, point);
         return IiIiiiilliIiiiil.IliIlllilIi(this.ilIilIIill, side, eye, var6[0], var6[1]) != null;
      }
   }

   private static boolean Iillllilll(int slot) {
      return slot >= 0 && slot <= 8;
   }

   private lilIillliilIilll IIIIllIIIl(String reason) {
      this.iIIilIIill.IiIlliIliiIl();
      this.IlIilIIill = iIilIlilIlilIlil.iIiilIiIil;
      this.IiiilIIill = reason;
      this.IililIIill = false;
      return lilIillliilIilll.iIIllIlill;
   }

   private boolean IIiIllIiIl(class_746 player) {
      long var4 = -6436253298482568788L;
      float var2 = this.IllIllllIl(player);
      var4 ^= ((long)(!this.llIilIIill.IiIlliIliiIl() && !(var2 >= player.method_6032() + player.method_6067() - 1.0F) ? 0 : 1) << 32 ^ var4) & -1L << 32;
      return (int)(var4 >>> 32) != 0 && !this.iIiIlIliIl(player)
         ? false
         : this.lIIilIIill.IIlllIlliIll(var2, this.illIlIilIl(var2), this.llIilIIill.IIlllIlliIll());
   }

   private float illIlIilIl(float full) {
      float var2 = this.llIilIIill.IlIlllIlilIl();
      return !(var2 <= 0.001F) && !(full > var2 + 0.5F) ? Math.min(full, this.llIilIIill.IIIllIIliIIl() * full / var2) : full;
   }

   private iIilIlilIlilIlil IIiilIiiiIii(iIilIlilIlilIlil p) {
      return switch (p) {
         case IIiilIiIil -> lliiIliliiIl.IilliliilIIi(this.ilIilIIill) < 0 ? iIilIlilIlilIlil.illilIiIil : this.IIiilIiiiIii(iIilIlilIlilIlil.illilIiIil);
         case iIiilIiIil -> this.IiIilIIill != null && lliiIliliiIl.lIiiIiIlilli(this.IiIilIIill)
         ? iIilIlilIlilIlil.IililIiIil
         : this.IIiilIiiiIii(iIilIlilIlilIlil.IililIiIil);
         case lllilIiIil -> lliiIliliiIl.IilliliilIIi(this.ilIilIIill) > 0 ? this.IIiilIiiiIii(iIilIlilIlilIlil.lililIiIil) : iIilIlilIlilIlil.lililIiIil;
         case IililIiIil -> this.lIlilIIill && !this.iIlilIIill ? iIilIlilIlilIlil.iililIiIil : iIilIlilIlilIlil.IIiilIiIil;
         case lililIiIil -> iIilIlilIlilIlil.IIiilIiIil;
         default -> iIilIlilIlilIlil.lIiilIiIil;
      };
   }

   private void Iliilliiilii(iIilIlilIlilIlil next) {
      this.iIIilIIill.IiIlliIliiIl();
      this.IlIilIIill = next;
      this.lllilIIill = this.lIIilIIill.IIillIiliIil();
      this.illilIIill = (next == iIilIlilIlilIlil.IIiilIiIil ? 10 : 4) + iilllIIill();
      this.IililIIill = false;
      this.lililIIill = false;
      this.iililIIill = Long.MIN_VALUE;
      this.IIiilIIill = 0;
      this.lIiilIIill++;
   }

   public int IIIllIIliIIl() {
      return this.Iilllilliill() ? this.iIIilIIill.IlIlllIlilIl() : Integer.MAX_VALUE;
   }

   public boolean IIlllIlliIll() {
      return this.IlIilIIill == iIilIlilIlilIlil.illilIiIil && this.iIIilIIill.IIIllIIliIIl();
   }

   private lilIillliilIilll IIlilIliiIli(class_746 player) {
      long var4 = 8694781272874024790L;
      var4 ^= ((long)lliiIliliiIl.IilliliilIIi(this.ilIilIIill) << 32 ^ var4) & -1L << 32;
      if ((int)(var4 >>> 32) < 0) {
         return this.IIIIllIIIl(ilillIiill<"ilillIiill","PBRIgjgjMWRNWBGoAzQtUPaFPzRhp5uSM68y0W9x2y97MpqVvflD">());
      } else if ((int)(var4 >>> 32) > 0) {
         this.Iliilliiilii(this.IIiilIiiiIii(iIilIlilIlilIlil.lililIiIil));
         return lilIillliilIilll.iiiIlIlill;
      } else if (this.lIlIliIlIl()) {
         return this.IIIIllIIIl(ilillIiill<"ilillIiill","U4RuyNE1NfO/ed9P1jjRYMv1b7JsQKVDgXuTsWiNO1RiC7xgxaBxjh6s">());
      } else {
         if (!this.iiIIlIIlIl()) {
            if (!lIIlliIIll(player, this.iiIilIIill, class_1802.field_8801)) {
               var4 ^= ((long)liIlliiIll(this.iiIilIIill, IlIllllIll(player, class_1802.field_8801), ilIllIiIll()) ^ var4) & -1L >>> 32;
               if ((int)var4 < 0) {
                  return this.IIIIllIIIl(ilillIiill<"ilillIiill","4O6ieWDEOiR1uh0liaM3+h/9i4PU9eRepNEiwJg/FAjtdnlBKqUyFA==">());
               }

               this.iiIilIIill = (int)var4;
               this.iIIilIIill.IiIlliIliiIl();
               this.IililIIill = false;
            }

            if (this.lIIilIIill.IiIlliIliiIl()) {
               this.IiiIlliiIl(player, false);
               return lilIillliilIilll.iiiIlIlill;
            }
         }

         if (!this.IililIIill) {
            if (this.lilIliilIl() && !this.IIiIllIiIl(player)) {
               return this.IIIIllIIIl(ilillIiill<"ilillIiill","EqiBKLCxwPj8i7ajSrisWcY/dZu8WLXtcy2RQizolmo75f1DwWnbYBbfn3pmg2da">());
            }

            if (!this.IllilIIill && !this.IIiIllIiIl(player)) {
               return this.IIIIllIIIl(ilillIiill<"ilillIiill","Ge/iYEkxQNfI43CFZoKCz7Ba1awb3oGsUt5L6w5giRkeTw==">());
            }

            if ((this.llIilIIill.IiIlliIliiIl() || this.IllIllllIl(player) >= player.method_6032() + player.method_6067() - 1.0F) && !this.lliIliliIl(player)) {
               if (++this.IIiilIIill > 10) {
                  return this.IIIIllIIIl(ilillIiill<"ilillIiill","DASWObLPrUf+PtxjJM2IBCCAOlduT8cmgefoFJ3qTJlGmNJm">());
               }

               this.IiiIlliiIl(player, false);
               return lilIillliilIilll.iiiIlIlill;
            }

            if (!this.iIIilIIill.liiiIIllIl(this.ilIilIIill, this.iiIilIIill, liIlIllliiIlIlll::lIilliIill, this.illilIIill)) {
               return this.IIIIllIIIl(ilillIiill<"ilillIiill","SV9jLHhZdHIZ5pyheVa3sPTEKncYHqgijAXyahxlZIXbFbucrJ8saA==">());
            }

            this.IililIIill = true;
         }

         lilIillliilIilll var3 = this.iIIilIIill.iIlIlllllill();
         if (var3 == lilIillliilIilll.IIIllIlill) {
            this.IiIIlliIIl();
         }

         if (var3 == lilIillliilIilll.lIIllIlill) {
            this.Iliilliiilii(this.IIiilIiiiIii(iIilIlilIlilIlil.lililIiIil));
            return lilIillliilIilll.iiiIlIlill;
         } else {
            return var3 == lilIillliilIilll.iIIllIlill
               ? this.IIIIllIIIl(this.llIIlilIIl(ilillIiill<"ilillIiill","1ppDf/tqulHDw2YiMX8X5S8gH3jo9MJwUixD2YSgkt+9RA==">()))
               : var3;
         }
      }
   }
}
