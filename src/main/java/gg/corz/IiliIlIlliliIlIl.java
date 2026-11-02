package gg.corz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.OptionalLong;
import java.util.Set;
import java.util.function.Predicate;
import net.minecraft.class_11908;
import net.minecraft.class_1661;
import net.minecraft.class_1703;
import net.minecraft.class_1713;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_408;
import net.minecraft.class_433;
import net.minecraft.class_465;
import net.minecraft.class_490;
import net.minecraft.class_9290;
import net.minecraft.class_9334;

public final class IiliIlIlliliIlIl {
   private int lIIIllIiIl;
   private int iliiIlIiIl;
   private int IIIIllIiIl;
   private String IIiiIlIiIl;
   private IiIIIIilliIIIIil llIIllIiIl;
   private static final class_310 lIliIlIiIl = class_310.method_1551();
   private int liIIllIiIl;
   private static volatile boolean llliIlIiIl = false;
   private String IiiiIlIiIl;
   private String lIiiIlIiIl;
   private final Set<Integer> lllIllIiIl;
   private int IIlIllIiIl;
   private int IliiIlIiIl;
   private static final int lIiIllIiIl = 40;
   private int ilIIllIiIl;
   private iIIiiIIlIlIiiIIl IlIIllIiIl;
   private static final int iIiIllIiIl = 60;
   private String liliIlIiIl = IIllllIlll<"IIllllIlll","LU+/HwSBfrVrhX8hLdZicBeWubO15zYlXQmNgd8lXkRA6PM=">();
   private int IllIllIiIl;
   private int iiIIllIiIl;
   private static final int iilIllIiIl = 5;
   private static volatile String illiIlIiIl = null;
   private static volatile String IlliIlIiIl = null;
   private class_1792 liiiIlIiIl;
   private int illIllIiIl;
   private Predicate<class_1799> iiiiIlIiIl;
   private boolean lliiIlIiIl;
   private int IiIIllIiIl;
   private static long IiliIlIiIl;
   private int iIIIllIiIl;
   private static final class_1792[] iIliIlIiIl = new class_1792[]{
      class_1802.field_8581,
      class_1802.field_8656,
      class_1802.field_19049,
      class_1802.field_19057,
      class_1802.field_8131,
      class_1802.field_8687,
      class_1802.field_8733
   };
   private String IilIllIiIl;
   private static final int iIlIllIiIl = 2400;
   private String iiliIlIiIl = IIllllIlll<"IIllllIlll","nEWkNbyFYona10Wncxt3fPQbuwCe8Z7zqf2N3yvhG98Vdlk=">();
   private static final int lilIllIiIl = 100;
   private String iIiiIlIiIl;
   private int lIlIllIiIl;

   private void IIlilIliiIli() {
      this.lIIlliIIll();
      this.iiIIlIIlIl();
      if (this.llIIlilIIl()) {
         lIliIlIiIl.field_1724.method_7346();
      }

      this.IlIIllIiIl = iIIiiIIlIlIiiIIl.llllIlilIl;
      this.llIIllIiIl = IiIIIIilliIIIIil.IIlIiIIIil;
   }

   private int lliIliliIl() {
      long var5 = -1931680927577913970L;
      if (lIliIlIiIl.field_1724 == null) {
         return 0;
      } else {
         class_1661 var1 = lIliIlIiIl.field_1724.method_31548();
         var5 ^= (0L ^ var5) & -1L << 32;

         for (var5 ^= (0L ^ var5) & -1L >>> 32; (int)var5 <= 35; var5 ^= (var5 ^ var5 + (long)1) & -1L >>> 32) {
            class_1799 var4 = var1.method_5438((int)var5);
            if (this.iIiIlIliIl(var4)) {
               var5 ^= ((long)((int)(var5 >>> 32) + var4.method_7947()) << 32 ^ var5) & -1L << 32;
            }
         }

         return (int)(var5 >>> 32);
      }
   }

   public IiIIIIilliIIIIil IIIllIIliIIl() {
      return this.llIIllIiIl;
   }

   private void lIlIliIlIl(int glfwKey) {
      if (lIliIlIiIl.field_1755 != null) {
         try {
            class_11908 var2 = new class_11908(glfwKey, 0, 0);
            lIliIlIiIl.field_1755.method_25404(var2);
            lIliIlIiIl.field_1755.method_16803(var2);
         } catch (Throwable var3) {
         }
      }
   }

   public void Iilllilliill() {
      if (this.llIIllIiIl == IiIIIIilliIIIIil.iiIIiIIIil) {
         if (lIliIlIiIl.field_1724 != null && lIliIlIiIl.field_1761 != null) {
            this.ilIIllIiIl++;
            if (this.lliIliliIl() > this.lIlIllIiIl) {
               this.IIlilIliiIli();
            } else {
               String var1 = illiIlIiIl;
               if (var1 != null) {
                  illiIlIiIl = null;
                  this.Iilililiiili(var1);
               } else if (this.ilIIllIiIl > 2400) {
                  this.Iilililiiili(IIllllIlll<"IIllllIlll","u5/Nel0DSccDCsNlItmMZSsDzo0eUvWpIbNGWGe0bUuDXJYZLg==">());
               } else {
                  switch (this.IlIIllIiIl) {
                     case IIllIlilIl:
                        this.IIillIiliIil();
                        break;
                     case illlIlilIl:
                        this.Ililllililil();
                        break;
                     case iIllIlilIl:
                        this.Iiilliiliiil();
                        break;
                     case IlllIlilIl:
                        this.IIIilIIiiIIi();
                        break;
                     case liIlIlilIl:
                        this.IlIillIiilIi();
                        break;
                     case llllIlilIl:
                        this.IiIiliIiiiIi();
                  }
               }
            }
         } else {
            this.Iilililiiili(IIllllIlll<"IIllllIlll","yrvDQVwNmIfXrvI9v9DpcPWSNViMI/jX7PmqhnKMQ5ovBgdH3g==">());
         }
      }
   }

   private boolean lilIliilIl() {
      long var3 = -5584472109654377140L;
      if (lIliIlIiIl.field_1755 != null && this.llIIlilIIl()) {
         if (!this.IIiiIlIiIl.isEmpty()) {
            String var1 = iIIiiilIlIiiil.IliIlllilIi(lIliIlIiIl.field_1755.method_25440().getString()).toLowerCase(Locale.ROOT);
            if (var1.contains(this.IIiiIlIiIl)) {
               return true;
            }
         }

         var3 ^= ((long)(this.IIIIllIIIl(iIliIlIiIl) >= 0 ? 1 : 0) << 32 ^ var3) & -1L << 32;
         var3 ^= ((long)(this.IIIIllIIIl(class_1802.field_8879, class_1802.field_19058, class_1802.field_8077) >= 0 ? 1 : 0) ^ var3) & -1L >>> 32;
         return (int)(var3 >>> 32) != 0 && (int)var3 != 0;
      } else {
         return false;
      }
   }

   public static boolean IliIlllilIi() {
      return IlliIlIiIl != null;
   }

   private int IIIIllIIIl(class_1792... mats) {
      long var10 = -8742732106559246339L;
      long var12 = -8408057084550501733L;
      if (!this.llIIlilIIl()) {
         return -1;
      } else {
         class_1703 var2 = lIliIlIiIl.field_1724.field_7512;
         var10 ^= ((long)(var2.field_7761.size() - 36) << 32 ^ var10) & -1L << 32;

         for (long var15 = var10 ^ (0L ^ var10) & -1L >>> 32; (int)var15 < (int)(var15 >>> 32); var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32) {
            class_1799 var5 = var2.method_7611((int)var15).method_7677();
            if (!var5.method_7960()) {
               class_1792[] var6 = mats;
               var12 ^= ((long)mats.length << 32 ^ var12) & -1L << 32;

               for (var12 ^= (0L ^ var12) & -1L >>> 32; (int)var12 < (int)(var12 >>> 32); var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32) {
                  class_1792 var9 = var6[(int)var12];
                  if (var5.method_31574(var9)) {
                     return (int)var15;
                  }
               }
            }
         }

         return -1;
      }
   }

   private boolean Iiiiliiiiiii() {
      long var4 = -2924702952445144121L;
      if (!this.llIIlilIIl()) {
         return false;
      } else {
         class_1703 var1 = lIliIlIiIl.field_1724.field_7512;
         var4 ^= ((long)(var1.field_7761.size() - 36) << 32 ^ var4) & -1L << 32;
         var4 ^= ((long)this.iIIIlIlIIl(this.iiliIlIiIl) ^ var4) & -1L >>> 32;
         if ((int)var4 < 0) {
            var4 ^= ((long)this.IIIIllIIIl(iIliIlIiIl) ^ var4) & -1L >>> 32;
         }

         if ((int)var4 >= 0 && (int)var4 < (int)(var4 >>> 32)) {
            lIliIlIiIl.field_1761.method_2906(var1.field_7763, (int)var4, 0, class_1713.field_7790, lIliIlIiIl.field_1724);
            return true;
         } else {
            return false;
         }
      }
   }

   public boolean lIiiIiIlilli(String retryDelayTicks, class_1792 filledSearchCommand, Predicate<class_1799> maxRetries, int targetGain, int matcher, int want) {
      if (lIliIlIiIl.field_1724 == null || filledSearchCommand == null) {
         return false;
      } else if (!this.IiiIlliiIl(filledSearchCommand)) {
         this.llIIllIiIl = IiIIIIilliIIIIil.lIlIiIIIil;
         this.IlIIllIiIl = iIIiiIIlIlIiiIIl.illlIlilIl;
         this.IilIllIiIl = IIllllIlll<"IIllllIlll","tomcFeEpev77W4Yn25DSMEtDRVHKjzX7o3WKBtz8ZbyAv+sSubN8xhQX">();
         return false;
      } else {
         this.IiiiIlIiIl = liIlliiIll(retryDelayTicks);
         this.liiiIlIiIl = filledSearchCommand;
         this.iiiiIlIiIl = maxRetries;
         this.IIIIllIiIl = Math.max(1, targetGain);
         this.lIIIllIiIl = Math.max(0, matcher);
         this.iIIIllIiIl = Math.max(0, want);
         this.iiIIllIiIl = 0;
         this.ilIIllIiIl = 0;
         this.lllIllIiIl.clear();
         this.illIllIiIl = -1;
         this.IllIllIiIl = -1;
         this.IilIllIiIl = "";
         this.lliiIlIiIl = false;
         this.iliiIlIiIl = 0;
         this.liIIllIiIl = -1000;
         this.IIlIllIiIl = this.lliIliliIl();
         this.lIlIllIiIl = this.IIlIllIiIl;
         this.iiiIlIIIll();
         this.IlIllllIll(iIIiiIIlIlIiiIIl.liIlIlilIl);
         this.llIIllIiIl = IiIIIIilliIIIIil.iiIIiIIIil;
         return true;
      }
   }

   public boolean IilliliilIIi(String want, class_1792 filledSearchCommand, int retryDelayTicks, int targetGain, int maxRetries) {
      return this.lIiiIiIlilli(want, filledSearchCommand, null, retryDelayTicks, targetGain, maxRetries);
   }

   private boolean IiIIlliIIl() {
      if (lIliIlIiIl.field_1755 == null || this.llIIlilIIl() || lIliIlIiIl.field_1755 instanceof class_490) {
         return false;
      } else if (lIliIlIiIl.field_1755 instanceof class_408) {
         return false;
      } else if (this.IIiiIlIiIl.isEmpty()) {
         return false;
      } else {
         String var1 = iIIiiilIlIiiil.IliIlllilIi(lIliIlIiIl.field_1755.method_25440().getString()).toLowerCase(Locale.ROOT);
         return var1.contains(this.IIiiIlIiIl);
      }
   }

   private void IiIiliIiiiIi() {
      if (this.llIIlilIIl()) {
         lIliIlIiIl.field_1724.method_7346();
      } else if (this.IiIIlliIIl()) {
         this.iiIIlIIlIl();
      } else {
         if (this.ilIllIiIll() >= this.lIIIllIiIl) {
            this.IlIllllIll(iIIiiIIlIlIiiIIl.liIlIlilIl);
         }
      }
   }

   public boolean IlIlllIlilIl() {
      return this.llIIllIiIl == IiIIIIilliIIIIil.iiIIiIIIil;
   }

   private void Illillliilli(String why) {
      this.IilIllIiIl = why;
      if (this.illIllIiIl >= 0) {
         this.lllIllIiIl.add(this.illIllIiIl);
      }

      this.illIllIiIl = -1;
      if (this.iiIIllIiIl >= this.iIIIllIiIl) {
         this.Iilililiiili(why);
      } else {
         this.iiIIllIiIl++;
         this.iiIIlIIlIl();
         if (this.llIIlilIIl()) {
            lIliIlIiIl.field_1724.method_7346();
         }

         this.IlIllllIll(iIIiiIIlIlIiiIIl.IlllIlilIl);
      }
   }

   public IiliIlIlliliIlIl() {
      this.IIiiIlIiIl = IIllllIlll<"IIllllIlll","Je2Q1ryetxV/pN7WOkHK15iP9AarPnWgRYAr86PhudFbb64=">();
      this.lIiiIlIiIl = IIllllIlll<"IIllllIlll","c93Ty8f0695qG1PAVTAtQlaALV5HsBM59KbDypY=">();
      this.iIiiIlIiIl = IIllllIlll<"IIllllIlll","AJ5IzVe540Bi70ZqXbyZAft239dfPYC8vMMjOWoDL0rn7bnW8Q6dFWlE">();
      this.IliiIlIiIl = 4;
      this.IlIIllIiIl = iIIiiIIlIlIiiIIl.llllIlilIl;
      this.llIIllIiIl = IiIIIIilliIIIIil.liIIiIIIil;
      this.IllIllIiIl = -1;
      this.lllIllIiIl = new HashSet<>();
      this.illIllIiIl = -1;
      this.IilIllIiIl = "";
   }

   private boolean IllIllllIl() {
      if (!this.llIIlilIIl()) {
         return false;
      } else {
         String var1 = lIliIlIiIl.field_1755 != null
            ? iIIiiilIlIiiil.IliIlllilIi(lIliIlIiIl.field_1755.method_25440().getString()).toLowerCase(Locale.ROOT)
            : "";
         return !this.liliIlIiIl.isEmpty() && var1.contains(this.liliIlIiIl) ? true : this.IIiIllIiIl();
      }
   }

   private boolean IiiIlliiIl(class_1792 it) {
      long var5 = 1714497991065748327L;
      if (lIliIlIiIl.field_1724 == null) {
         return false;
      } else {
         class_1661 var2 = lIliIlIiIl.field_1724.method_31548();

         for (long var7 = var5 ^ (0L ^ var5) & -1L << 32; (int)(var7 >>> 32) < 36; var7 += 4294967296L) {
            class_1799 var4 = var2.method_5438((int)(var7 >>> 32));
            if (var4.method_7960()) {
               return true;
            }

            if (var4.method_31574(it) && var4.method_7947() < var4.method_7914()) {
               return true;
            }
         }

         return false;
      }
   }

   private boolean llIIlilIIl() {
      return lIliIlIiIl.field_1724 != null
         && lIliIlIiIl.field_1755 instanceof class_465
         && !(lIliIlIiIl.field_1755 instanceof class_490)
         && lIliIlIiIl.field_1724.field_7512 != null
         && lIliIlIiIl.field_1724.field_7512 != lIliIlIiIl.field_1724.field_7498;
   }

   private void Iiilliiliiil() {
      long var2 = -2495844075051873452L;
      if (!this.illIlIilIl()) {
         this.IlIllllIll(iIIiiIIlIlIiiIIl.liIlIlilIl);
      } else if (this.ilIIllIiIl - this.liIIllIiIl >= this.IliiIlIiIl) {
         if (!this.IiiIlliiIl(this.liiiIlIiIl)) {
            this.Iilililiiili(IIllllIlll<"IIllllIlll","tomcFeEpev77W4Yn25DSMEtDRVHKjzX7o3WKBtz8ZbyAv+sSubN8xhQX">());
         } else {
            var2 ^= ((long)this.IIiilIiiiIii() << 32 ^ var2) & -1L << 32;
            if ((int)(var2 >>> 32) < 0) {
               this.Illillliilli(IIllllIlll<"IIllllIlll","zkbUCfAsPtUavMVDTfuFm/WgiQy2TkLwz49WxViujIYjA6H1ih3Xs6VypJKf2YM=">());
            } else {
               this.illIllIiIl = (int)(var2 >>> 32);
               this.IIlIllIiIl = this.lliIliliIl();
               llliIlIiIl = false;
               lIliIlIiIl.field_1761.method_2906(this.IllIllIiIl, (int)(var2 >>> 32), 0, class_1713.field_7790, lIliIlIiIl.field_1724);
               this.liIIllIiIl = this.ilIIllIiIl;
               this.IlIllllIll(iIIiiIIlIlIiiIIl.lIllIlilIl);
            }
         }
      }
   }

   private int ilIllIiIll() {
      return this.ilIIllIiIl - this.IiIIllIiIl;
   }

   private int iIIIlIlIIl(String word) {
      long var13 = -5434694812159804283L;
      long var15 = 3768426066502051029L;
      if (word != null && !word.isEmpty() && this.llIIlilIIl()) {
         String[] var2 = word.toLowerCase(Locale.ROOT).split(IIllllIlll<"IIllllIlll","IDEcg/Rae85J88juNLTnlFBPUpqBNq8JkKctmYs=">());
         class_1703 var3 = lIliIlIiIl.field_1724.field_7512;
         var13 ^= ((long)(var3.field_7761.size() - 36) << 32 ^ var13) & -1L << 32;

         for (long var18 = var13 ^ (0L ^ var13) & -1L >>> 32; (int)var18 < (int)(var18 >>> 32); var18 ^= (var18 ^ var18 + (long)1) & -1L >>> 32) {
            class_1799 var6 = var3.method_7611((int)var18).method_7677();
            if (!var6.method_7960()) {
               String var7 = iIIiiilIlIiiil.IliIlllilIi(var6.method_7964().getString()).toLowerCase(Locale.ROOT);
               String[] var8 = var2;
               var15 ^= ((long)var2.length << 32 ^ var15) & -1L << 32;

               for (var15 ^= (0L ^ var15) & -1L >>> 32; (int)var15 < (int)(var15 >>> 32); var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32) {
                  String var11 = var8[(int)var15];
                  String var12 = var11.trim();
                  if (!var12.isEmpty() && var7.contains(var12)) {
                     return (int)var18;
                  }
               }
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   private boolean IIiIllIiIl() {
      long var4 = -6936155369740859402L;
      if (!this.llIIlilIIl()) {
         return false;
      } else {
         class_1703 var1 = lIliIlIiIl.field_1724.field_7512;
         var4 ^= ((long)(var1.field_7761.size() - 36) << 32 ^ var4) & -1L << 32;

         for (long var7 = var4 ^ (0L ^ var4) & -1L >>> 32; (int)var7 < (int)(var7 >>> 32); var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32) {
            if (this.iIiIlIliIl(var1.method_7611((int)var7).method_7677())) {
               return true;
            }
         }

         return false;
      }
   }

   private void IIillIiliIil() {
      if (this.llIIlilIIl()) {
         lIliIlIiIl.field_1724.method_7346();
         this.liIIllIiIl = this.ilIIllIiIl;
      } else if (this.IiIIlliIIl()) {
         this.iiIIlIIlIl();
         this.liIIllIiIl = this.ilIIllIiIl;
      } else if (lIliIlIiIl.field_1755 != null && !(lIliIlIiIl.field_1755 instanceof class_433)) {
         if (this.ilIllIiIll() > 100) {
            this.Illillliilli(IIllllIlll<"IIllllIlll","0AQ5hzm4YYzuUm/RoTfTWuy9coDbBSASQ3KjQ839vXenhsTT1nYr">());
         }
      } else if (this.ilIIllIiIl - this.liIIllIiIl >= this.IliiIlIiIl) {
         if (System.nanoTime() - IiliIlIiIl >= 1500000000L) {
            IiliIlIiIl = System.nanoTime();
            llliIlIiIl = false;
            lIliIlIiIl.field_1724.field_3944.method_45730(this.IiiiIlIiIl);
            this.liIIllIiIl = this.ilIIllIiIl;
            this.IllIllIiIl = -1;
            this.lllIllIiIl.clear();
            this.illIllIiIl = -1;
            this.IlIllllIll(iIIiiIIlIlIiiIIl.iiIlIlilIl);
         }
      }
   }

   private boolean illIlIilIl() {
      return this.IllIllllIl() && lIliIlIiIl.field_1724.field_7512.field_7763 == this.IllIllIiIl;
   }

   public static void liiiIIllIl(String line) {
      if (line != null) {
         String var1 = IlliIlIiIl;
         if (var1 != null && !var1.isEmpty()) {
            String var2 = iIIiiilIlIiiil.IliIlllilIi(line).toLowerCase(Locale.ROOT).trim();
            if (var2.startsWith(IIllllIlll<"IIllllIlll","jKnQAqv0EYYA16rMrlZ3ZE/Yw+pGU3vAD66YMV5vh1i2Vpz0gZ+iEger">() + var1)
               || var2.equals(var1)
               || var2.equals(var1 + IIllllIlll<"IIllllIlll","M2+wZjbkQKqvU71T4nI+a3xFaLXP7vPj+LC7d9k=">())
               || var2.equals(var1 + IIllllIlll<"IIllllIlll","PptqR1LQKaXcSCmPLCM9mne9XsrjWUghdJeu9v4=">())) {
               llliIlIiIl = true;
            } else if (var2.startsWith(IIllllIlll<"IIllllIlll","6a36c7l4oWtEnEB8Cuvn/3A71Joc3UTHgg28tvUX+//UtOJL2R64sXUTwQ0+RGU8cz9UTMF6lyg=">())) {
               illiIlIiIl = IIllllIlll<"IIllllIlll","S7/E+A4TLsYiOHuMzmtSfvVfP2T+1dwpMx+AwLSF0LtCmz5bAQhGx3BEKFU=">();
            } else if (var2.startsWith(IIllllIlll<"IIllllIlll","gyxBovNhTN1tR+okXJksR029RccZhylixsqVW5gSBF1kwXmAxf6httPnvsSnD/4M1b8=">())) {
               illiIlIiIl = IIllllIlll<"IIllllIlll","tomcFeEpev77W4Yn25DSMEtDRVHKjzX7o3WKBtz8ZbyAv+sSubN8xhQX">();
            }
         }
      }
   }

   private boolean iIiIlIliIl(class_1799 st) {
      if (st != null && !st.method_7960()) {
         return this.iiiiIlIiIl != null ? this.iiiiIlIiIl.test(st) : st.method_31574(this.liiiIlIiIl);
      } else {
         return false;
      }
   }

   public String IiIlliIliiIl() {
      return this.IilIllIiIl;
   }

   private void lIIlliIIll() {
      IlliIlIiIl = null;
      llliIlIiIl = false;
      illiIlIiIl = null;
   }

   private void iiIIlIIlIl() {
      if (lIliIlIiIl.field_1755 != null && this.IiIIlliIIl()) {
         try {
            lIliIlIiIl.field_1755.method_25419();
         } catch (Throwable var2) {
         }
      }
   }

   public int IIlllIlliIll() {
      return this.liiiIlIiIl == null ? 0 : Math.max(0, this.lliIliliIl() - this.lIlIllIiIl);
   }

   private int IIiilIiiiIii() {
      long var12 = -1139236615234182967L;
      long var14 = 6372933374863422913L;
      if (!this.llIIlilIIl()) {
         return -1;
      } else {
         class_1703 var1 = lIliIlIiIl.field_1724.field_7512;
         var12 ^= ((long)(var1.field_7761.size() - 36) << 32 ^ var12) & -1L << 32;
         var12 ^= ~var12 & -1L >>> 32;
         long var4 = Long.MAX_VALUE;

         for (long var18 = var14 ^ (0L ^ var14) & -1L << 32; (int)(var18 >>> 32) < (int)(var12 >>> 32); var18 += 4294967296L) {
            if (!this.lllIllIiIl.contains((int)(var18 >>> 32))) {
               class_1799 var7 = var1.method_7611((int)(var18 >>> 32)).method_7677();
               if (!var7.method_7960() && this.iIiIlIliIl(var7)) {
                  List var8 = Iliilliiilii(var7);
                  OptionalLong var9 = iIIiiilIlIiiil.IilliliilIIi(var8.subList(1, var8.size()), this.lIiiIlIiIl);
                  if (!var9.isEmpty()) {
                     long var10 = this.lliiIlIiIl ? var9.getAsLong() * 64L / (long)Math.max(1, var7.method_7947()) : var9.getAsLong();
                     if (var10 < var4) {
                        var4 = var10;
                        var12 ^= ((long)((int)(var18 >>> 32)) ^ var12) & -1L >>> 32;
                     }
                  }
               }
            }
         }

         return (int)var12;
      }
   }

   private void Ililllililil() {
      if (!this.IllIllllIl()) {
         if (this.ilIllIiIll() > 100) {
            this.Illillliilli(IIllllIlll<"IIllllIlll","BZ76Ej4MQF8C7Z59RJ93HQrCJwtHoNqzBHNN/zp2wvxQ2dNIX57BLbx2FQ==">());
         }
      } else {
         if (this.IllIllIiIl < 0) {
            this.IllIllIiIl = lIliIlIiIl.field_1724.field_7512.field_7763;
         }

         if (this.ilIllIiIll() >= 5) {
            this.IlIllllIll(iIIiiIIlIlIiiIIl.IIllIlilIl);
         }
      }
   }

   public void iliIiiliiiii(boolean on) {
      this.lliiIlIiIl = on;
   }

   private void IlIillIiilIi() {
      if (this.lliIliliIl() > this.IIlIllIiIl) {
         this.IIlilIliiIli();
      } else if (llliIlIiIl) {
         llliIlIiIl = false;
         this.Illillliilli(IIllllIlll<"IIllllIlll","AJ5IzVe540Bi70ZqXbyZAft239dfPYC8vMMjOWoDL0rn7bnW8Q6dFWlE">());
      } else {
         if (this.llIIlilIIl() && this.lilIliilIl() && this.ilIIllIiIl - this.liIIllIiIl >= this.IliiIlIiIl) {
            this.Iiiiliiiiiii();
            this.liIIllIiIl = this.ilIIllIiIl;
         }

         if (this.IiIIlliIIl() && this.ilIIllIiIl - this.liIIllIiIl >= this.IliiIlIiIl * 3) {
            this.IlIllllIll(iIIiiIIlIlIiiIIl.lIllIlilIl);
         } else {
            if (this.ilIllIiIll() > 60) {
               this.Illillliilli(IIllllIlll<"IIllllIlll","0R+qK1tS+dvjXMWBF1QjMD0k+K/EGLS941DtjEMVw5NhLkeg6+BJE/1TIDJSpw==">());
            }
         }
      }
   }

   private static String liIlliiIll(String s) {
      String var1 = s == null ? "" : s.trim();
      return var1.startsWith(IIllllIlll<"IIllllIlll","KheiYHpdRyaUnxHDKCuVSWEpnUWGkU7bVI5vN4c=">()) ? var1.substring(1) : var1;
   }

   private void iiiIlIIIll() {
      IlliIlIiIl = this.iIiiIlIiIl == null ? "" : this.iIiiIlIiIl.toLowerCase(Locale.ROOT).trim();
      llliIlIiIl = false;
      illiIlIiIl = null;
   }

   private void Iilililiiili(String why) {
      this.IilIllIiIl = why;
      this.lIIlliIIll();
      this.iiIIlIIlIl();
      if (lIliIlIiIl.field_1724 != null && this.llIIlilIIl()) {
         lIliIlIiIl.field_1724.method_7346();
      }

      this.IlIIllIiIl = iIIiiIIlIlIiiIIl.illlIlilIl;
      this.llIIllIiIl = IiIIIIilliIIIIil.lIlIiIIIil;
   }

   public void iIlIlllllill(
      String priceWord, String boardTitleWord, String alreadyBoughtWord, String clickSpacing, String confirmYesWord, Integer confirmTitleWord
   ) {
      if (priceWord != null) {
         this.liliIlIiIl = priceWord.toLowerCase(Locale.ROOT).trim();
      }

      if (boardTitleWord != null) {
         this.iiliIlIiIl = boardTitleWord;
      }

      if (alreadyBoughtWord != null) {
         this.IIiiIlIiIl = alreadyBoughtWord.toLowerCase(Locale.ROOT).trim();
      }

      if (clickSpacing != null) {
         this.lIiiIlIiIl = clickSpacing;
      }

      if (confirmYesWord != null) {
         this.iIiiIlIiIl = confirmYesWord.toLowerCase(Locale.ROOT).trim();
      }

      if (confirmTitleWord != null) {
         this.IliiIlIiIl = Math.max(2, confirmTitleWord);
      }
   }

   private void IIIilIIiiIIi() {
      long var3 = -3231206899564372149L;
      if (this.lliIliliIl() > this.IIlIllIiIl) {
         this.IIlilIliiIli();
      } else if (llliIlIiIl) {
         llliIlIiIl = false;
         this.Illillliilli(IIllllIlll<"IIllllIlll","AJ5IzVe540Bi70ZqXbyZAft239dfPYC8vMMjOWoDL0rn7bnW8Q6dFWlE">());
      } else if (this.IiIIlliIIl()) {
         if (this.ilIIllIiIl - this.liIIllIiIl >= this.IliiIlIiIl) {
            if (this.iliiIlIiIl == 0) {
               this.lIlIliIlIl(263);
               this.iliiIlIiIl = 1;
               this.liIIllIiIl = this.ilIIllIiIl;
            } else {
               this.lIlIliIlIl(257);
               this.iliiIlIiIl = 0;
               this.liIIllIiIl = this.ilIIllIiIl;
               this.IlIllllIll(iIIiiIIlIlIiiIIl.iIllIlilIl);
            }
         }
      } else {
         if (this.llIIlilIIl()) {
            var3 ^= ((long)(lIliIlIiIl.field_1724.field_7512.field_7763 == this.IllIllIiIl && !this.lilIliilIl() ? 0 : 1) << 32 ^ var3) & -1L << 32;
            if ((int)(var3 >>> 32) != 0) {
               if (this.ilIIllIiIl - this.liIIllIiIl < this.IliiIlIiIl) {
                  return;
               }

               if (this.Iiiiliiiiiii()) {
                  this.liIIllIiIl = this.ilIIllIiIl;
                  this.IlIllllIll(iIIiiIIlIlIiiIIl.iIllIlilIl);
                  return;
               }

               if (this.ilIllIiIll() > 40) {
                  this.Illillliilli(IIllllIlll<"IIllllIlll","TKidd0wUKblrrwRb2TMbBaIC/WbZdHTZRmC9i0yK8tlN9zIPph3wgTnFXjW4">());
               }

               return;
            }

            if (this.illIllIiIl >= 0) {
               class_1799 var2 = lIliIlIiIl.field_1724.field_7512.method_7611(this.illIllIiIl).method_7677();
               if (var2.method_7960() || !this.iIiIlIliIl(var2)) {
                  this.Illillliilli(IIllllIlll<"IIllllIlll","4G8f0fGuLKo2FUmOXIwQ8xT9VWTtRhi03159WeZwjAINP5r6L5Rw9A==">());
                  return;
               }
            }
         }

         if (this.ilIllIiIll() > 40) {
            this.Illillliilli(IIllllIlll<"IIllllIlll","wmvbqq9kQE8Imam5HUZwE0oSF3E9oFo3/lCgyFOIBE3WY9XYIyMEzPdsJzl8">());
         }
      }
   }

   private static List<String> Iliilliiilii(class_1799 st) {
      ArrayList var1 = new ArrayList();
      var1.add(st.method_7964().getString());
      class_9290 var2 = (class_9290)st.method_58694(class_9334.field_49632);
      if (var2 != null) {
         for (class_2561 var4 : var2.comp_2400()) {
            var1.add(var4.getString());
         }
      }

      return var1;
   }

   private void IlIllllIll(iIIiiIIlIlIiiIIl p) {
      this.IlIIllIiIl = p;
      this.IiIIllIiIl = this.ilIIllIiIl;
   }

   public void Illlllllilll() {
      this.lIIlliIIll();
      this.iiIIlIIlIl();
      if (lIliIlIiIl.field_1724 != null && this.llIIlilIIl()) {
         lIliIlIiIl.field_1724.method_7346();
      }

      this.IlIIllIiIl = iIIiiIIlIlIiiIIl.llllIlilIl;
      this.llIIllIiIl = IiIIIIilliIIIIil.liIIiIIIil;
   }
}
