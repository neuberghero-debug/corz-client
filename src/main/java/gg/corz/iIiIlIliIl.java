package gg.corz;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.EndTick;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1303;
import net.minecraft.class_1661;
import net.minecraft.class_1713;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2346;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_3610;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_638;
import net.minecraft.class_744;
import net.minecraft.class_746;
import net.minecraft.class_2338.class_2339;
import net.minecraft.class_2350.class_2351;
import net.minecraft.class_2350.class_2353;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

public final class iIiIlIliIl {
   private boolean iiiIiIlIIIliIl;
   private int IlIliIlllIliIl;
   private final ArrayDeque<class_2338> IIiiiIllIiiiIl;
   private int IIlliIllIlliIl;
   private final ilIIIIiIiIIIIi IililIllililIl;
   private final Set<class_2338> illIiIlIilIiIl;
   private final Map<class_2338, Integer> IlllIllllllIll;
   private double iiIiiIlIIliiIl;
   private final Map<class_2338, Integer> lIllIlliIllIll;
   private int lillIlliillIll;
   private int lilIllliilIlll;
   private static final int IIillIllIillIl = 160;
   private class_2338 IIlIIlllIlIIll;
   private int iIIIlllIlIIlll;
   private class_2338 lllIIllillIIll;
   private int lllliIlillliIl;
   private int IllIllllllIlll;
   private boolean lIIlllliIIllll;
   private final Map<class_2338, Integer> iiIlIllIIllIll;
   private int IiliIllliliIll;
   private double iIliIllIlliIll;
   private final Set<class_2338> IiIlIllliIlIll;
   private static final int liIilIliiIilIl = 60000;
   private class_744 IiIIiIlliIIiIl;
   private long liIiIlliiIiIll;
   private boolean ilIiIllIiIiIll;
   private class_2338 iliiIllIiiiIll;
   private final iIIiIliIlIiIli liiilIliiiilIl;
   private static final int iIillIlIlillIl = 60;
   private class_2338 lliiiIliliiiIl;
   private final Map<class_2338, Integer> illlIllIillIll;
   private int liiliIliiiliIl;
   private int iiIIlllIIlIlll;
   private int lliIllliliIlll;
   private final class_310 lllilIlillilIl;
   private int IilliIllilliIl;
   private class_2338 lIlIiIliIlIiIl;
   private int lIlIllliIlIlll;
   private final Set<class_2338> IIiIiIllIiIiIl;
   private int IlIiIllllIiIll;
   private static final int llillIlilillIl = 600;
   private boolean IiiIiIlliiIiIl;
   private int IiiiiIlliiiiIl;
   private boolean IiilIllliilIll;
   private iIiiiIIlIliiiIIl iIIIiIlIlIIiIl;
   private final llilIIIiililIIIi iililIlIIiilIl;
   private boolean IlliiIlllliiIl;
   private static final int iIlilIlIllilIl = 200;
   private final lIIIliiliIIIliil iliilIlIiiilIl;
   private boolean IiIIlllliIIlll;
   private final Set<class_2338> iIlliIlIllliIl;
   private int liliiIliiliiIl;
   private final List<class_2338> lIIliIliIIliIl;
   private static final int iiilIllIIIiIll = 300;
   private int iIiIiIlIliIiIl;
   private int illiiIlIiliiIl;
   private final Set<class_2338> lilIiIliilIiIl;
   private int liiiIlliiiiIll;
   private boolean illIlllIilIlll;
   private class_1792 IiiIlllliiIlll;
   private boolean IIIIllllIIIlll;
   private boolean ilIIIllIiIIIll;
   private lilIIliiilIIli llIIiIlilIIiIl;
   private class_746 iiiIlllIIIllll;
   private int llIIlllilIIlll;
   private static final int lIIilIliIIilIl = 70;
   private final liiiliIliiiiliIl IliilIllliilIl;
   private int liiIIlliiiIIll;
   private static final int iIIlIllIlIlIll = 60;
   private int IliIIlllliIIll;
   private int liIIIlliiIIIll;
   private int lIiIIlliIiIIll;
   private class_2338 lIIIIlliIIIIll;
   private class_1792 iIiIlllIliIlll;
   private llliIiIiilliIiIi lIiliIliIiliIl;
   private int llilIllililIll;
   private boolean lliIiIliliIiIl;
   private boolean iiIIiIlIIlIiIl;
   private class_2338 lIliiIliIliiIl;
   private class_2338 IIliIlllIliIll;
   private String iiliIllIIiiIll;
   private final iilIiiIiIIiIiiIi lIiilIliIiilIl = new iilIiiIiIIiIiiIi();
   private int IIIlIlllIIlIll;
   private static final int IlIilIlllIilIl = 20;
   private int liIliIliiIliIl;
   private lllIlIIlillIlIIl IIIIiIllIIIiIl;
   private int ililiIlIiiliIl;
   private static final int lIIiIlliIIiIll = 200;
   private int iIlIIllIllIIll;
   private double IiIiiIlliIiiIl;
   private int iiiiiIlIIIIIll;
   private boolean iIIiiIlIlIiiIl;
   private int IlIIIllllIIIll;
   private int llliIllilliIll;
   private int IilIIlllilIIll;
   private boolean iliIIllIiiIIll;
   private class_2338 IliliIllliliIl;
   private static final int IIlilIllIlilIl = 4;
   private int IIiIllllIiIlll;
   private int IIIiiIllIIiiIl;
   private class_2338 IliiIlllliiIll;
   private static final int IiillIlliillIl = 600;
   private boolean iilliIlIIiliIl;
   private static final int iiillIlIIIilIl = 1200;
   private int ilIliIlIiIliIl;
   private int IIilIlllIilIll;
   private boolean IllIiIllllIiIl;
   private static final int ilIilIlIiIilIl = 2;
   private double llIiiIlilIiiIl;
   private int iilIIllIIiIIll;
   private static final int llIlIllilIlIll = 3;
   private static final int lilllIliilllIl = 4096;
   private class_2338 iIiiiIlIliiiIl;
   private class_2338 lIiiIlliIiiIll;
   private final Set<class_2338> iIilIllIlilIll;

   private void lliliilili() {
      this.Iiililiili();
      if (this.IIIIiIllIIIiIl != null) {
         this.IIIIiIllIIIiIl.IliIlllilIi();
      }
   }

   public class_2338 iliIiiliiiii() {
      return this.IliilIllliilIl.IIiilIiiiIii();
   }

   private boolean IiIliliIli(class_1937 p, class_746 w) {
      long var8 = 5086248071679531819L;

      while (!this.IIiiiIllIiiiIl.isEmpty() && !this.IlIiillIii(p, this.IIiiiIllIiiiIl.peek())) {
         class_2338 var3 = this.IIiiiIllIiiiIl.poll();
         if (var3.equals(this.lliiiIliliiiIl)) {
            this.IiiiiIlliiiiIl++;
            this.lliiiIliliiiIl = null;
         }

         this.iiiiiIlIIIIIll = 0;
      }

      if (this.IiiiiIlliiiiIl >= 3) {
         this.IIiiiIllIiiiIl.clear();
         this.iIiiiIlIliiiIl = null;
         this.lliiiIliliiiIl = null;
         return false;
      } else if (this.IIiiiIllIiiiIl.isEmpty()) {
         return false;
      } else if (this.iiiiiIlIIIIIll > 600) {
         this.IIiiiIllIiiiIl.clear();
         this.iIiiiIlIliiiIl = null;
         this.llliiillii(
            iiIIIlIIlIIl<"iiIIIlIIlIIl","4mnFn+yZLka438dcbrGG1+9ITYeWzfQxXs3bvf0+Cx0C64hfsn9mH1dSXwI4n5SokBpwWtsRWiyioRmQW5F5kZ4GLrwoAmSK11hsNlycanWHoiQzSIGhXgXexmgb86bN9FtwiRxlx3o=">()
         );
         return false;
      } else {
         class_2338 var10 = this.IIiiiIllIiiiIl.peek();
         if (this.lIllIlliIllIll.containsKey(var10)) {
            this.IIiiiIllIiiiIl.clear();
            this.iIiiiIlIliiiIl = null;
            this.lliiiIliliiiIl = null;
            this.llliiillii(
               iiIIIlIIlIIl<"iiIIIlIIlIIl","emylGXfECW++zt16jUeMAy7CnyN+/9lFhcvdglVCrjQJ3HDcJOM2GtVcz4ytK/Nsk0iVTEGeGDV396ncaE8es8DLM41ULF2+PFdiRNlwqC8T+dGmlWQ=">()
            );
            return false;
         } else {
            double var4 = Math.max(this.IililIllililIl.iIiiIIiliIliiIIili, w.method_55754());
            var8 ^= ((long)(this.IiiiiIlliiiiIl + 1) << 32 ^ var8) & -1L << 32;
            if (this.IliilIllliilIl.IIlllIlliIll(var10, var4)) {
               this.lliiiIliliiiIl = var10;
               this.Ilillllill(var10, var4, true);
               this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","yt4CjaKKdg0erXz1QcbRWGxIto+F8P2pi/W9cZVDhlqd1bQBkL21ASM=">()
                  + (int)(var8 >>> 32)
                  + iiIIIlIIlIIl<"iiIIIlIIlIIl","tgeqGSiuNvJXpKhi23GFhcbRbbNdqcC1Mu7kh2Ow">();
               return true;
            } else if (this.IIIlilIIli(p, w, var10, var4)) {
               return true;
            } else {
               class_2338 var7 = this.iIliiIllii(p, w, var10);
               if (var7 == null) {
                  var7 = new class_2338(var10.method_10263(), this.iIIIiIlIlIIiIl.iIlIlllllill(), var10.method_10260());
               }

               this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","wklfzSYrWDx1sj7vFDMQADwfhP/lT3Pq1YOBCcaM0eKNtmboxUAKJE8CiFwo8lUZJZhSfA==">()
                  + (int)(var8 >>> 32)
                  + iiIIIlIIlIIl<"iiIIIlIIlIIl","tgeqGSiuNvJXpKhi23GFhcbRbbNdqcC1Mu7kh2Ow">();
               if (!var7.equals(this.iIiiiIlIliiiIl)) {
                  this.iIiiiIlIliiiIl = var7.method_10062();
                  this.IIIIiIllIIIiIl.IliIlllilIi();
               }

               if (this.Iliilliiilii(p, w, var7)) {
                  if (this.lIiliIliIiliIl == llliIiIiilliIiIi.liiIiIiIIi) {
                     this.IIiiiIllIiiiIl.clear();
                     this.iIiiiIlIliiiIl = null;
                     return false;
                  } else {
                     return true;
                  }
               } else {
                  if (this.IIIIiIllIIIiIl.IIlilIliiIli(var7) == lillilliillill.IIlilIlIilIlilIlIi) {
                     this.iIilIllIlilIll.add(var7.method_10062());
                     this.iIiiiIlIliiiIl = null;
                     this.IIIIiIllIIIiIl.IliIlllilIi();
                  }

                  return true;
               }
            }
         }
      }
   }

   public List<class_2338> Illlllllilll() {
      return this.llIIiIlilIIiIl == lilIIliiilIIli.illIliiiiIilIliiii && this.iIIIiIlIlIIiIl != null && !this.iIIIiIlIlIIiIl.Iilililiiili()
         ? this.iIIIiIlIlIIiIl.IIillIiliIil()
         : List.of();
   }

   private boolean IlIiillIii(class_1937 pos, class_2338 w) {
      if (!this.iililIlIIiilIl.IlIillIiilIi(w) || !this.lIIiiiIIii(w) || pos.method_8320(w).method_26215() || this.IIlilIliiIli(pos, w)) {
         return false;
      } else {
         return this.iIlliIlIllliIl.contains(w) && !(pos.method_8320(w).method_26204() instanceof class_2346) ? false : lllIIlilillIIlil.IilliliilIIi(pos, w);
      }
   }

   private boolean ilIiiIiIii(class_2338 pos) {
      class_746 var2 = this.lllilIlillilIl.field_1724;
      if (var2 == null) {
         return false;
      } else {
         class_2338 var3 = var2.method_24515();
         return pos.equals(var3.method_10074())
            ? true
            : pos.method_10264() < var3.method_10264() && pos.method_10262(var3) <= 4.0 && this.IIIIiIllIIIiIl.iIlIlllllill().contains(pos);
      }
   }

   private int liilliiill(class_1937 w, int limit) {
      long var7 = -3060608074086273798L;
      long var9 = 2665088705277469494L;
      var7 ^= (0L ^ var7) & -1L << 32;

      for (var7 ^= ((long)this.iIIIiIlIlIIiIl.liiiIIllIl() ^ var7) & -1L >>> 32;
         (int)var7 >= this.iIIIiIlIlIIiIl.iIlIlllllill();
         var7 ^= (var7 ^ var7 + (long)-1) & -1L >>> 32
      ) {
         var9 ^= ((long)this.iIIIiIlIlIIiIl.IIIIllIIIl() << 32 ^ var9) & -1L << 32;

         while ((int)(var9 >>> 32) <= this.iIIIiIlIlIIiIl.iIIIlIlIIl()) {
            for (var9 ^= ((long)this.iIIIiIlIlIIiIl.llIIlilIIl() ^ var9) & -1L >>> 32;
               (int)var9 <= this.iIIIiIlIlIIiIl.IiIIlliIIl();
               var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32
            ) {
               if (this.IlIiillIii(w, this.iIIIiIlIlIIiIl.IIlilIliiIli((int)(var9 >>> 32), (int)var9, (int)var7))) {
                  var7 += 4294967296L;
                  if ((int)(var7 >>> 32) >= limit) {
                     return (int)(var7 >>> 32);
                  }
               }
            }

            var9 += 4294967296L;
         }
      }

      return (int)(var7 >>> 32);
   }

   private boolean illilIilil(class_746 p) {
      long var8 = -1800640692690699418L;
      long var10 = -5267819233579714738L;
      if (!this.IililIllililIl.liliIIiliiiliIIili) {
         this.IiilIllliilIll = false;
         return false;
      } else if (this.IlIiIllllIiIll > 0) {
         this.IlIiIllllIiIll--;
         this.IiilIllliilIll = false;
         return false;
      } else {
         var8 ^= (0L ^ var8) & -1L << 32;
         if (!this.iIIIiIlIlIIiIl.Iilililiiili()) {
            class_2338 var3 = this.iIIIiIlIlIIiIl.Ililllililil();
            double var4 = (double)var3.method_10263() + 0.5 - p.method_23317();
            double var6 = (double)var3.method_10260() + 0.5 - p.method_23321();
            var8 ^= ((long)(var4 * var4 + var6 * var6 <= 6.25 ? 1 : 0) << 32 ^ var8) & -1L << 32;
         }

         var8 ^= (
               (long)(
                     !this.iIIIiIlIlIIiIl.Iilililiiili()
                           && (this.lIiliIliIiliIl != llliIiIiilliIiIi.IiiIiIiIIi || (int)(var8 >>> 32) != 0)
                           && this.lIiliIliIiliIl != llliIiIiilliIiIi.liiIiIiIIi
                           && this.IliiIlllliiIll == null
                        ? 0
                        : 1
                  )
                  ^ var8
            )
            & -1L >>> 32;
         if ((int)var8 != 0) {
            this.IiilIllliilIll = false;
            return false;
         } else {
            var10 ^= ((long)(p.method_31478() < this.iIIIiIlIlIIiIl.iIlIlllllill() ? 1 : 0) << 32 ^ var10) & -1L << 32;
            if (!this.IiilIllliilIll && (int)(var10 >>> 32) == 0) {
               return false;
            } else if (this.IiilIllliilIll && (int)(var10 >>> 32) == 0 && p.method_24828()) {
               this.IiilIllliilIll = false;
               this.llilIllililIll = 0;
               this.lililiilil(llliIiIiilliIiIi.iiiIiIiIIi);
               return false;
            } else {
               this.IiilIllliilIll = true;
               this.llilIllililIll++;
               this.lIlIiIliIlIiIl = null;
               if (this.llilIllililIll > 300) {
                  this.IiilIllliilIll = false;
                  this.llilIllililIll = 0;
                  this.IlIiIllllIiIll = 200;
                  this.lIiilIliIiilIl.iIlIlllllill();
                  this.IIIIiIllIIIiIl.IliIlllilIi();
                  this.lililiilil(llliIiIiilliIiIi.liiIiIiIIi);
                  this.llliiillii(
                     iiIIIlIIlIIl<"iiIIIlIIlIIl","Mz+4zc0Zlp7fOJcJDlHA+fI9VMb0B1nR5CHXAAvkAQYDNJxsTYF71b4O4HZV+/BHurSFIV3QNQR/0aV01AL6pPkq81aOCf3jKd2e31i0tJ8kgHPzQP3EDVyTLL1KiINzE+c/QARZUMeH">()
                  );
                  return false;
               } else if (!this.IIIIiIllIIIiIl.IiIlliIliiIl(p)) {
                  if (!liliIliiiliIli.IIIllIIliIIl(p)) {
                     this.lIiilIliIiilIl.iIlIlllllill();
                     this.lilliiilli(
                        iiIIIlIIlIIl<"iiIIIlIIlIIl","QkYReD/oA9U5bWchWoyGNfIG5pmD9noFFs/10WOqeSFMzaWna7R/7ht1vzVC+TidguH/Ic4TUVq/nwmpyvDwhZ8dpsTkf4rCM8x5C3ZFBDGAvDfI3DuaXxrU5owPTu9lVmhV3ugFYdbbfTnY4FrhfG/pq27wrvw5YlHexsebo/GZ1l5wIK88KGFGpSWP4hiU">()
                     );
                     this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","RFq73wrRqSEmltMPJEV4+znKkvLv0ZlXGIp5QAMlcX9CKkye6UAuofg0l435Gf6Rj1ad43CzcM2tTopAPomiWZl3MovJm3QS">();
                     return true;
                  } else {
                     this.IiilIllliilIll = false;
                     return false;
                  }
               } else {
                  this.iiliIllIIiiIll = this.IIIIiIllIIIiIl.IlIlllIlilIl()
                     ? iiIIIlIIlIIl<"iiIIIlIIlIIl","DPI5/8deDRmwYvpTlngdkRcKpVfMO2iB6gTYm9PcHo00ta4XWCIefoZK7iLFhSCBQHyWuMPPobiFwi/0qr38c9dGfXd1f16Ezjncgv4GDLKIIdt9vQ==">()
                     : iiIIIlIIlIIl<"iiIIIlIIlIIl","ZOfZrasLYuxiVWCtTtE3hzEKiNsBRtQ4P6pGtsKztnm5QJFhapm2MO8VPp8ivZKhICbPhv6n4ybULFPfjQ==">()
                        + this.llilIllililIll / 20
                        + iiIIIlIIlIIl<"iiIIIlIIlIIl","Qwr8/k5o9DLMu8wpXlO/C24xGRmGCl4bCDm2ckzY">();
                  return true;
               }
            }
         }
      }
   }

   private void ilillIiill(class_2338 pos) {
      long var5 = 6900340097477064888L;
      long var7 = 5913827749594995263L;
      var5 ^= (-4294967296L ^ var5) & -1L << 32;

      while ((int)(var5 >>> 32) <= 1) {
         for (var5 ^= ~var5 & -1L >>> 32; (int)var5 <= 1; var5 ^= (var5 ^ var5 + (long)1) & -1L >>> 32) {
            for (var7 ^= (-4294967296L ^ var7) & -1L << 32; (int)(var7 >>> 32) <= 1; var7 += 4294967296L) {
               this.IlllIllllllIll.put(pos.method_10069((int)(var5 >>> 32), (int)var5, (int)(var7 >>> 32)), 8);
            }
         }

         var5 += 4294967296L;
      }
   }

   private void IllIllllIl() {
      if (this.llIIiIlilIIiIl == lilIIliiilIIli.lilIliiiiiilIliiii && this.iiIIiIlIIlIiIl) {
         this.llIIiIlilIIiIl = lilIIliiilIIli.illIliiiiIilIliiii;
         this.iiIIiIlIIlIiIl = false;
         this.lililiilil(llliIiIiilliIiIi.iiiIiIiIIi);
      }
   }

   private boolean iilIiIIiIi(class_1937 p, class_746 w) {
      long var8 = -8372964815114241008L;
      class_2338 var3 = this.IliilIllliilIl.IIiilIiiiIii();
      if (var3 != null && this.lIlIiIliIlIiIl != null && var3.equals(this.lIlIiIliIlIiIl)) {
         double var4 = Math.max(this.IililIllililIl.iIiiIIiliIliiIIili, w.method_55754());
         if (this.IlIiillIii(p, var3) && this.IliilIllliilIl.IIlllIlliIll(var3, var4)) {
            this.lIiilIliIiilIl.IliliiiIIi = true;
            this.IIIlIlllIIlIll = this.iIiilIliil(var3) ? 0 : this.IIIlIlllIIlIll + 1;
            var8 ^= ((long)(this.IililIllililIl.ilIIlIiliIiIIlIili && this.IIIlIlllIIlIll > 60 ? 1 : 0) << 32 ^ var8) & -1L << 32;
            if (++this.liiIIlliiiIIll <= 1200 && (int)(var8 >>> 32) == 0) {
               this.Ilillllill(var3, var4, this.IllIiIllllIiIl);
               return true;
            } else {
               this.liiIIlliiiIIll = 0;
               this.IIIlIlllIIlIll = 0;
               this.lIllIlliIllIll.put(var3.method_10062(), 600);
               this.IliilIllliilIl.Iilililiiili();
               this.lIlIiIliIlIiIl = null;
               this.liliiIliiliiIl++;
               this.lIiilIliIiilIl.IliliiiIIi = false;
               var8 ^= ((long)this.iiIlIllIIllIll.merge(var3.method_10062(), 1, Integer::sum).intValue() ^ var8) & -1L >>> 32;
               if ((int)(var8 >>> 32) != 0) {
                  this.IliilIllliilIl.IliIlllilIi(var3);
               }

               if (this.IililIllililIl.ilIIlIiliIiIIlIili && (int)var8 >= 3) {
                  this.IiIlIllliIlIll.add(var3.method_10062());
                  this.llliiillii(
                     iiIIIlIIlIIl<"iiIIIlIIlIIl","OQ5q9pZZfy/s9Gz04l8rhZ6dYigvL/jiESn/AUI0OlsbyFTFExGZaowQzUlfJyifiBOp5yjlIw==">()
                        + var3.method_23854()
                        + iiIIIlIIlIIl<"iiIIIlIIlIIl","7x+hsJPz2IbYVxcvCHcM5GtWtzIcG/Uwqgoe57vIfYOBh5Q=">()
                        + (int)var8
                        + iiIIIlIIlIIl<"iiIIIlIIlIIl","QyijWDG0TmDPcNCS81MDorEk/AaUELIagOYUfnJG/7WA+PKJp9ZcRcyJly8SDhaFj6/6jlPyX1E1upJ9wA==">()
                  );
                  this.lililiilil(llliIiIiilliIiIi.liiIiIiIIi);
                  return false;
               } else {
                  if ((int)(var8 >>> 32) != 0) {
                     this.llliiillii(
                        iiIIIlIIlIIl<"iiIIIlIIlIIl","vacFtOfs+t9B+9AAGH5idpiA8etsfPAsOCca+HFykmGmbVQorPOe5tfMIgJVcnaeEoOoYVGw8MU0rTh0846WIQSR4om5RQPxXA==">()
                           + var3.method_23854()
                           + iiIIIlIIlIIl<"iiIIIlIIlIIl","Bjt53Fq8bk15nDKwzlXJabnAmivtIp9fA08ABigxjgej1XHBuL3ZXGNxdCgDavNVxj8O1DY=">()
                     );
                  } else {
                     this.llliiillii(
                        iiIIIlIIlIIl<"iiIIIlIIlIIl","CzocHzmeEKoqLypp3yGapah7HxsK4nCYhB1SsGixSVWlEs2a+FMa9jUTfLA=">()
                           + var3.method_23854()
                           + iiIIIlIIlIIl<"iiIIIlIIlIIl","aEu6Lh29fXqouUMc7JUJYC6oSH20GiYzfa+lH1gj8XcWtu0CJ3pN1ZLQJtZmFUGGJY6vFZL9upCQEMV6YWIax8ow4710gONhAik9CCK1fSvE3vsTf9FteDTKgl70Po0P">()
                     );
                  }

                  this.lililiilil(llliIiIiilliIiIi.liiIiIiIIi);
                  return false;
               }
            }
         } else {
            this.liiIIlliiiIIll = 0;
            this.IIIlIlllIIlIll = 0;
            this.lIiilIliIiilIl.IliliiiIIi = false;
            return false;
         }
      } else {
         this.liiIIlliiiIIll = 0;
         this.IIIlIlllIIlIll = 0;
         this.lIiilIliIiilIl.IliliiiIIi = false;
         return false;
      }
   }

   private boolean IIlilIliiIli(class_1937 pos, class_2338 w) {
      return !this.illIiIlIilIiIl.contains(w) && !this.lilIiIliilIiIl.contains(w)
         ? false
         : !pos.method_8320(w).method_26215() && liilIlIiiiilIlIi.IIlilIliiIli(pos, w, this.IIiIiIllIiIiIl.contains(w), this.iililIlIIiilIl::IlIillIiilIi);
   }

   private boolean IlIllllIll(class_746 w, class_1937 p) {
      long var4 = -2957489314187886235L;
      if (!this.IililIllililIl.IIiiIIililIiiIIili) {
         return false;
      } else if (this.ilIllIiIll(w, p, this.iIIIiIlIlIIiIl.iIlIlllllill(), this.iIIIiIlIlIIiIl.liiiIIllIl(), false)) {
         return true;
      } else {
         var4 ^= ((long)this.liIlliiIll(p, this.iIIIiIlIlIIiIl.iIlIlllllill(), this.iIIIiIlIlIIiIl.liiiIIllIl()) << 32 ^ var4) & -1L << 32;
         if ((int)(var4 >>> 32) > 0 && !this.IlllIllllllIll.isEmpty()) {
            this.lIiilIliIiilIl.iIlIlllllill();
            this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","0XNlXAj7SQM4qQDmNkormjJrKOFvAR+WRUfqj9iBQxdeCDBxsZdh/C9Jas+ZHeJRTc3oiuaglzFfQeVZW7Yt3BY=">();
            return true;
         } else if ((int)(var4 >>> 32) > 0 && this.iIiIiIlIliIiIl < 2) {
            this.iIiIiIlIliIiIl++;
            this.lIllIlliIllIll.clear();
            this.iIilIllIlilIll.clear();
            this.llliiillii(
               iiIIIlIIlIIl<"iiIIIlIIlIIl","NtJ7yEagjNFCo+vStAcvQx9awxvYheerJy2jxb/qXJPvqw==">()
                  + (this.iIIIiIlIlIIiIl.iiIIlIIlIl() + 1)
                  + iiIIIlIIlIIl<"iiIIIlIIlIIl","deVMLzK4monDP9SrsQGiXasWMix4qpsuRL1jLIGU">()
                  + (int)(var4 >>> 32)
                  + iiIIIlIIlIIl<"iiIIIlIIlIIl","tdUTeYW58UTMeKwHCcuIWkwoen2ZZq7QyKnhY7SrM2x8Hsl4nd8iTaG5">()
                  + ((int)(var4 >>> 32) == 1 ? "" : iiIIIlIIlIIl<"iiIIIlIIlIIl","2fEfodXdr0S71BGyf2zQzW/mBn88Z6JKuyHlplc=">())
                  + iiIIIlIIlIIl<"iiIIIlIIlIIl","8t5eMa1HeqsvzYolFPfu16GUKxeA0VIr4hP/1+mC30cYPTz2P9Kr+GV0sxox/VMvQJdBZS52AxTaNDI6USE=">()
                  + this.iIiIiIlIliIiIl
                  + iiIIIlIIlIIl<"iiIIIlIIlIIl","dmq/JJPmY7O6mww+I/rNWJmBAKNeIP8SC1aCRA8=">()
                  + 2
                  + iiIIIlIIlIIl<"iiIIIlIIlIIl","FS8x+FRiaAgjmBWaGWVc/oseF/3kiOR6gzr35aY=">()
            );
            return true;
         } else {
            this.iIiIiIlIliIiIl = 0;
            this.lIllIlliIllIll.clear();
            return false;
         }
      }
   }

   private void Illlilllli(class_1937 pos, class_2338 w) {
      class_746 var3 = this.lllilIlillilIl.field_1724;
      if (var3 != null) {
         if (this.IliilIllliilIl.IIlllIlliIll(w, this.IililIllililIl.iIiiIIiliIliiIIili)) {
            if (this.IIIIiIllIIIiIl.iliIiiliiiii()) {
               this.IIIIiIllIIIiIl.IIIllIIliIIl();
            }

            this.lililiilil(llliIiIiilliIiIi.iiiIiIiIIi);
         } else {
            if (this.lIliiIliIliiIl == null) {
               this.lIliiIliIliiIl = this.iIliiIllii(pos, var3, w);
               if (this.lIliiIliIliiIl == null) {
                  this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","ZoMYozXoiLnsU7PlWEbmt0EgeOn62jmomxyj623fi9JYlW2YVJkJrG9niDCWVNif6F7NkXjLnIBedZm1FxctXO6ca2Q6T6b2KoRRU45rJBvQeWZOUQSdXK30/xuk4A==">();
                  this.iIilIllIlilIll.clear();
                  this.IIilIlllIilIll = 3;
                  this.IlliiIlllliiIl = true;
                  this.IIIIiIllIIIiIl.IliIlllilIi();
                  this.lililiilil(llliIiIiilliIiIi.IiiIiIiIIi);
                  return;
               }

               this.IIIIiIllIIIiIl.IliIlllilIi();
            }

            this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","JEHsyapPZOf7ntKsaIqMQsFqcOjRtHXPXNxILtZqfKXyj/DIzIqseOP99G0CiqD1P3qMZI+MtVgLgbpKi0TJNfVWRe5KdOkQg+taig==">();
            lillilliillill var4 = this.IIIIiIllIIIiIl.IIlilIliiIli(this.lIliiIliIliiIl);
            if (var4 == lillilliillill.liIilIlIiiiIilIlIi) {
               if (this.IIIIiIllIIIiIl.iliIiiliiiii()) {
                  this.IIIIiIllIIIiIl.IIIllIIliIIl();
               }

               this.iIilIllIlilIll.add(this.lIliiIliIliiIl);
               this.lIliiIliIliiIl = null;
               this.lililiilil(llliIiIiilliIiIi.iiiIiIiIIi);
            } else if (var4 == lillilliillill.IIlilIlIilIlilIlIi) {
               if (this.IIIIiIllIIIiIl.iliIiiliiiii()) {
                  this.IIIIiIllIIIiIl.IIIllIIliIIl();
               }

               this.iIilIllIlilIll.add(this.lIliiIliIliiIl);
               this.lIliiIliIliiIl = null;
            }
         }
      }
   }

   private boolean IIIIllIIIl(class_2338 drill, boolean pos) {
      class_746 var3 = this.lllilIlillilIl.field_1724;
      class_638 var4 = this.lllilIlillilIl.field_1687;
      if (var3 == null || var4 == null) {
         return true;
      } else if (this.IIlilIliiIli(var4, drill)) {
         return false;
      } else if (liilIlIiiiilIlIi.IIiilIiiiIii(var4, var3.method_5829(), drill, pos)) {
         this.iIIIlIlIIl(drill, iiIIIlIIlIIl<"iiIIIlIIlIIl","haxCYZjKT1VtLftMvcZ56eFcs/487k/6Y5znPNRLbjkY6XVkV7j14FLN4XBCRVTwZcc=">());
         return false;
      } else if (liilIlIiiiilIlIi.Illillliilli(var4, drill, pos) && (!this.IililIllililIl.liliIIiliiiliIIili || !this.iliilIlIiiilIl.Iliilliiilii(var3, true))) {
         this.iIIIlIlIIl(
            drill,
            this.IililIllililIl.liliIIiliiiliIIili
               ? iiIIIlIIlIIl<"iiIIIlIIlIIl","JPBqzDV3EjNcshcDbYkBUFORCYxuYdEg8n3Bl6SZtqjuPMbK9tNak4mbLueagOzNj8IO9ktkOYJ+i0VRe+xCRRYKGal9aLCn78TW1cUJm7w=">()
               : iiIIIlIIlIIl<"iiIIIlIIlIIl","cW6nhgo8/VpFdt2VvM6gsk8eO8qtR+fL78S74YJGY00kisDR6XuOqgTXR1mhqGaaQpgUHjdJs9InzgvHv0eKCaFpqd0R">()
         );
         return false;
      } else {
         return true;
      }
   }

   private boolean IliIilliIi(class_746 p) {
      long var25 = 3719786041390025955L;
      long var27 = -5849117211346292244L;
      if (p.method_24828() && this.iIIIiIlIlIIiIl != null) {
         double var2 = (double)this.iIIIiIlIlIIiIl.Iiilliiliiil() + 0.5;
         double var4 = this.iIIIiIlIlIIiIl.lIIlllilIl == class_2351.field_11048 ? p.method_23321() : p.method_23317();
         double var6 = var4 - var2;
         double var8 = Math.abs(var6);
         if (var8 <= 0.15) {
            return false;
         } else {
            double var10 = this.iIIIiIlIlIIiIl.lIIlllilIl == class_2351.field_11048 ? 0.0 : -var6;
            double var12 = this.iIIIiIlIlIIiIl.lIIlllilIl == class_2351.field_11048 ? -var6 : 0.0;
            class_638 var14 = this.lllilIlillilIl.field_1687;
            if (var14 != null) {
               var25 ^= ((long)((int)Math.floor(p.method_23317() + Math.signum(var10) * 0.35)) << 32 ^ var25) & -1L << 32;
               var25 ^= ((long)((int)Math.floor(p.method_23321() + Math.signum(var12) * 0.35)) ^ var25) & -1L >>> 32;
               var27 ^= ((long)((int)Math.floor(p.method_23318() - 0.1)) << 32 ^ var27) & -1L << 32;
               if (!lllIIlilillIIlil.iliIiiliiiii(var14, new class_2338((int)(var25 >>> 32), (int)(var27 >>> 32), (int)var25))) {
                  return false;
               }

               var27 ^= ((long)((int)Math.floor(p.method_23318() + 0.01)) ^ var27) & -1L >>> 32;
               if (!lllIIlilillIIlil.lIiiIiIlilli(var14, new class_2338((int)(var25 >>> 32), (int)var27, (int)var25))
                  || !lllIIlilillIIlil.lIiiIiIlilli(var14, new class_2338((int)(var25 >>> 32), (int)var27 + 1, (int)var25))) {
                  return false;
               }
            }

            double var15 = Math.toRadians((double)p.method_36454());
            double var17 = Math.sin(var15);
            double var19 = Math.cos(var15);
            double var21 = var12 * var19 - var10 * var17;
            double var23 = var12 * var17 + var10 * var19;
            this.lIiilIliIiilIl.liiiIIllIl(iliIiIiiIi(var21), iliIiIiiIi(var23), false, false, false);
            this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","FX5FrZGC9V2uUap1bdVo9+qJXGXu2ZamVNrMeDBnqhR/9do+NJDkIUH4pShrP5QB8PIDZgx00p4n3w2+38rHOV7Y">()
               + String.format(iiIIIlIIlIIl<"iiIIIlIIlIIl","yMjOA03DoL440Y3L8G0VHRbuoj4BYYf1V5ZbORLPdXw=">(), var8)
               + iiIIIlIIlIIl<"iiIIIlIIlIIl","FS8x+FRiaAgjmBWaGWVc/oseF/3kiOR6gzr35aY=">();
            return true;
         }
      } else {
         return false;
      }
   }

   private void Ilillllill(class_2338 drill, double pos, boolean reach) {
      if (this.iililIlIIiilIl.IlIillIiilIi(drill)) {
         if (this.IililIllililIl.ilIIlIiliIiIIlIili) {
            reach = false;
         }

         class_746 var5 = this.lllilIlillilIl.field_1724;
         if (var5 != null) {
            this.lIiIiiIiIi(var5, drill);
         }

         if (!drill.equals(this.lIlIiIliIlIiIl)) {
            this.lIlIiIliIlIiIl = drill.method_10062();
         }

         this.IllIiIllllIiIl = reach;
         if (!this.IliilIllliilIl.iliIiiliiiii(drill, pos, reach)) {
            this.IliilIllliilIl.Illillliilli();
            this.lIlIiIliIlIiIl = null;
         }
      }
   }

   private void illliIilli(class_1937 w, class_2338 pos) {
      this.lIiilIliIiilIl.iIlIlllllill();
      if (!this.IlIiillIii(w, pos)) {
         this.IliilIllliilIl.Illillliilli();
         this.lIlIiIliIlIiIl = null;
      } else if (!this.iIiilIliil(pos)) {
         this.IliilIllliilIl.Illillliilli();
         this.lIlIiIliIlIiIl = null;
         this.lililiilil(llliIiIiilliIiIi.iiiIiIiIIi);
      } else {
         class_746 var3 = this.lllilIlillilIl.field_1724;
         this.Ilillllill(
            pos, Math.max(this.IililIllililIl.iIiiIIiliIliiIIili, var3 != null ? var3.method_55754() : this.IililIllililIl.iIiiIIiliIliiIIili), true
         );
         if (this.lIlIiIliIlIiIl == null) {
            this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","fz/uK/LkEUYjIZ/sjDZbaSfqjFMrfwYl/n9dtdNnc9M7biuvnivs0VSeLeTs/zY2NdZdvqloXu6yxFE7TU/KIigQ2Hjks6SzC7THYa4=">();
            this.lililiilil(llliIiIiilliIiIi.liiIiIiIIi);
         } else {
            this.iiliIllIIiiIll = this.ililiIlIiiliIl > 200
               ? iiIIIlIIlIIl<"iiIIIlIIlIIl","4G9tPsj+xZTxAxhGZb8qkNbIn3IHwFEH236ikomqC+2QsXOFNB0=">()
                  + this.ililiIlIiiliIl / 20
                  + iiIIIlIIlIIl<"iiIIIlIIlIIl","BJwzCuPKuGJtJvcAjqfLzX2r1C/Nfp4gZWMnG1t+n8ifuzkJd8/2zixk+4DexVTr">()
               : iiIIIlIIlIIl<"iiIIIlIIlIIl","cnWfPpako9r1T+0BngvZsUxaQkZ8q/VbKKXyDuNHKguVjbihyaVahA==">()
                  + this.iIIIiIlIlIIiIl.IIlllIlliIll()
                  + iiIIIlIIlIIl<"iiIIIlIIlIIl","noY6qRFc4dqNzk8t23dUPVr7GqK8fvdec8jVcbE=">()
                  + this.iIIIiIlIlIIiIl.Illlllllilll()
                  + iiIIIlIIlIIl<"iiIIIlIIlIIl","PhnXjXYsZC/ddBpB21jtEMH1/lfwowTjGIWefpSXgkGK">();
         }
      }
   }

   private boolean lIIiiiIIii(class_2338 pos) {
      return !this.IiIlIllliIlIll.contains(pos)
         && (this.iililIlIIiilIl.iliIiiliiiii(pos) || this.IIIIiIllIIIiIl != null && this.IIIIiIllIIIiIl.iIlIlllllill().contains(pos));
   }

   private class_2338 Iillllilll(class_1937 pos, class_746 w, class_2338 p) {
      long var17 = 1397557694723406003L;
      long var15 = -3155302636900935644L;
      class_2338 var4 = w.method_24515();
      var15 ^= (4294967296L ^ var15) & -1L << 32;

      while ((int)(var15 >>> 32) <= 3) {
         class_2338 var6 = null;
         double var7 = Double.MAX_VALUE;

         for (var15 ^= ((long)(-((int)(var15 >>> 32))) ^ var15) & -1L >>> 32;
            (int)var15 <= (int)(var15 >>> 32);
            var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32
         ) {
            for (var17 ^= ((long)(-((int)(var15 >>> 32))) << 32 ^ var17) & -1L << 32; (int)(var17 >>> 32) <= (int)(var15 >>> 32); var17 += 4294967296L) {
               if (Math.max(Math.abs((int)var15), Math.abs((int)(var17 >>> 32))) == (int)(var15 >>> 32)) {
                  for (var17 ^= (-3L ^ var17) & -1L >>> 32; (int)var17 <= 1; var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32) {
                     class_2338 var12 = p.method_10069((int)var15, (int)var17, (int)(var17 >>> 32));
                     if (this.iililIlIIiilIl.IlIillIiilIi(var12)
                        && !this.iIilIllIlilIll.contains(var12)
                        && lllIIlilillIIlil.IIIllIIliIIl(pos, var12)
                        && this.IliilIllliilIl.Illlllllilll(var12, p, this.IililIllililIl.iIiiIIiliIliiIIili)) {
                        double var13 = var12.method_10262(var4) + (double)(Math.abs(var12.method_10264() - var4.method_10264()) * 25);
                        if (var13 < var7) {
                           var7 = var13;
                           var6 = var12;
                        }
                     }
                  }
               }
            }
         }

         if (var6 != null) {
            return var6;
         }

         var15 += 4294967296L;
      }

      for (long var22 = var15 ^ (-17179869184L ^ var15) & -1L << 32; (int)(var22 >>> 32) <= -2; var22 += 4294967296L) {
         class_2338 var19 = p.method_10086((int)(var22 >>> 32));
         if (this.iililIlIIiilIl.IlIillIiilIi(var19)
            && !this.iIilIllIlilIll.contains(var19)
            && lllIIlilillIIlil.IIIllIIliIIl(pos, var19)
            && this.IliilIllliilIl.Illlllllilll(var19, p, this.IililIllililIl.iIiiIIiliIliiIIili)) {
            return var19;
         }
      }

      return null;
   }

   private void ilIIiIiIIi(class_746 p) {
      long var9 = -4272824912111344429L;
      this.IilIililIi();
      if (p != null) {
         class_2338 var2 = this.iIIIiIlIlIIiIl.Ililllililil();
         var9 ^= ((long)this.iIIIiIlIlIIiIl.IiIlliIliiIl() << 32 ^ var9) & -1L << 32;
         if (this.iIIIiIlIlIIiIl.iIIIlIlIIl() - this.iIIIiIlIlIIiIl.IIIIllIIIl() >= 2) {
            var9 ^= ((long)Math.max(this.iIIIiIlIlIIiIl.IIIIllIIIl() + 1, Math.min(this.iIIIiIlIlIIiIl.iIIIlIlIIl() - 1, (int)(var9 >>> 32))) << 32 ^ var9)
               & -1L << 32;
         }

         class_2338 var4 = this.iIIIiIlIlIIiIl.IIlilIliiIli((int)(var9 >>> 32), this.iIIIiIlIlIIiIl.Iiilliiliiil(), var2.method_10264());
         class_638 var5 = this.lllilIlillilIl.field_1687;
         class_2338 var6 = null;
         if (var5 != null) {
            for (long var12 = var9 ^ ((long)(this.iIIIiIlIlIIiIl.liiiIIllIl() + 3) ^ var9) & -1L >>> 32;
               (int)var12 >= this.iIIIiIlIlIIiIl.liiiIIllIl();
               var12 ^= (var12 ^ var12 + (long)-1) & -1L >>> 32
            ) {
               class_2338 var8 = new class_2338(var4.method_10263(), (int)var12, var4.method_10260());
               if (lllIIlilillIIlil.IIIllIIliIIl(var5, var8)) {
                  var6 = var8;
                  break;
               }
            }
         }

         if (var6 == null) {
            var6 = new class_2338(var4.method_10263(), this.iIIIiIlIlIIiIl.liiiIIllIl() + 1, var4.method_10260());
         }

         this.lllIIllillIIll = var6.method_10062();
         this.lIIIIlliIIIIll = this.lllIIllillIIll;
         this.IilIIlllilIIll = var6.method_10264();
      }
   }

   iilIiiIiIIiIiiIi IIlllIlliIll() {
      return this.lIiilIliIiilIl;
   }

   private boolean iIIilIlIil(class_746 p) {
      long var7 = -2299137160914766451L;
      long var9 = 994059383679065602L;
      long var11 = 4045376705850078848L;
      if (!this.IililIllililIl.iiiiIIiliIIIIlIili) {
         this.IIIIllllIIIlll = false;
         return false;
      } else if (this.illIlllIilIlll) {
         var7 ^= (
               (long)(
                        this.lllilIlillilIl.field_1687 != null
                              && !this.lllilIlillilIl.field_1687.method_8390(class_1303.class, p.method_5829().method_1014(4.0), e -> true).isEmpty()
                           ? 1
                           : 0
                     )
                     << 32
                  ^ var7
            )
            & -1L << 32;
         if ((int)(var7 >>> 32) != 0 && ++this.lilIllliilIlll <= 200) {
            this.lIiilIliIiilIl.iIlIlllllill();
            this.IliilIllliilIl.Iilililiiili();
            this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","WJEN8XgqIxij/4vTqlMV25ZFVFwTCeijaD5L1+SAOc40Ub7NF0kCJfj4huxeRZMgI5LFcjuSQPJffj2q4g==">();
            return true;
         } else {
            this.illIlllIilIlll = false;
            this.lilIllliilIlll = 0;
            return false;
         }
      } else {
         class_1661 var2 = p.method_31548();
         if (!this.IIIIllllIIIlll) {
            if (this.IIIIiIllIIIiIl.lIiiIiIlilli() || this.IiilIllliilIll) {
               return false;
            }

            var7 ^= ((long)var2.method_67532() ^ var7) & -1L >>> 32;
            class_1799 var4 = var2.method_5438((int)var7);
            if (!var4.method_7963() || var4.method_7936() - var4.method_7919() > this.IililIllililIl.lIIIlIiliiIIIlIili) {
               return false;
            }

            if (this.IiIIlllliIIlll) {
               if (lIliliIlil(var2, class_1802.field_8287) < 0 && Illillllil(var2, class_1802.field_8287) < 0) {
                  return false;
               }

               this.IiIIlllliIIlll = false;
            }

            this.IIIIllllIIIlll = true;
            this.iIIIlllIlIIlll = (int)var7;
            this.llIIlllilIIlll = 0;
            this.iiIIlllIIlIlll = 0;
            this.lIlIllliIlIlll = Integer.MAX_VALUE;
            this.llliiillii(
               iiIIIlIIlIIl<"iiIIIlIIlIIl","6eL0ulvIc/+dCddLDzo7BquOOvYlqN1xrXzgWblD0mWkC5OzLA==">()
                  + (var4.method_7936() - var4.method_7919())
                  + iiIIIlIIlIIl<"iiIIIlIIlIIl","/Xb6Pn/ZUyu+SO++PHpQNJIXmoKGMeodcemUP17F1hSvj+H0cRI57TiJ/1WMVh7EJKu2d91rvJ5LEVdXP9tkLB2xZchwGFHgJRZRbvkNQMl839ozd90Jxu02">()
            );
         }

         class_1799 var3 = var2.method_5438(this.iIIIlllIlIIlll);
         var9 ^= ((long)(var3.method_7960() ? -1 : var3.method_7919()) << 32 ^ var9) & -1L << 32;
         if ((int)(var9 >>> 32) >= 0 && (int)(var9 >>> 32) < this.lIlIllliIlIlll) {
            this.iiIIlllIIlIlll = 0;
         } else if (++this.iiIIlllIIlIlll > 1200) {
            this.llliiillii(
               iiIIIlIIlIIl<"iiIIIlIIlIIl","A+ekTjoqmFeEDSa2yTlZ1w4dVz2IiDy0TaC6+7GDyxG4W/GnfMaOe+PrWKL4lIwOoNqXj31n2s2ZYBM1ZZtatjEMjm+0KNXhCfYTRZu8kODVfzjVuZBam+fralVUFDzKOporXPligLl91ISs+6uhWmc50g/f">()
            );
            this.IiIIlllliIIlll = true;
            this.IiIilliIil(p);
            this.IIIIllllIIIlll = false;
            this.iiIIlllIIlIlll = 0;
            this.lIlIllliIlIlll = Integer.MAX_VALUE;
            return false;
         }

         this.lIlIllliIlIlll = (int)(var9 >>> 32) < 0 ? Integer.MAX_VALUE : (int)(var9 >>> 32);
         if (!var3.method_7960() && var3.method_7963() && var3.method_7919() != 0) {
            this.lIiilIliIiilIl.iIlIlllllill();
            this.IliilIllliilIl.Iilililiiili();
            this.lIlIiIliIlIiIl = null;
            if (var2.method_67532() != this.iIIIlllIlIIlll) {
               var2.method_61496(this.iIIIlllIlIIlll);
            }

            if (p.method_6079().method_7909() != class_1802.field_8287) {
               var9 ^= ((long)lIliliIlil(var2, class_1802.field_8287) ^ var9) & -1L >>> 32;
               var11 ^= ((long)((int)var9 >= 0 ? 36 + (int)var9 : Illillllil(var2, class_1802.field_8287)) << 32 ^ var11) & -1L << 32;
               if ((int)(var11 >>> 32) >= 0) {
                  this.IllIllllllIlll = 0;
                  this.llIililIil((int)(var11 >>> 32));
                  this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","L30Qh1IGpMhl3+phg+534Zi+XimGxqG8JbcLBplhwkyaOWp1s/8afNrTjRqBOyg7nT41vMCJ/ON7BdKGAglIqK/yKdodaJvvnQ==">();
                  return true;
               } else if (++this.IllIllllllIlll <= 20) {
                  this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","wS1GtCy4RHxNL03bPThryxlkvhBd6SqCZeTytfRLCh9ZmC4Oe+zd41QYoFF8CpQrs0ol6a+9b7O9FAfRuQz3eg==">();
                  return true;
               } else {
                  this.IllIllllllIlll = 0;
                  this.llliiillii(
                     iiIIIlIIlIIl<"iiIIIlIIlIIl","B5PKW/KHJj7i/IQfeAOS+jTXkIpzcy4tUNCEZjRFjO32tvrbBl0y2y8r5d0Sb2g0DiHLedJ5Dit0MpzGP6k=">()
                        + (var3.method_7936() - var3.method_7919())
                        + iiIIIlIIlIIl<"iiIIIlIIlIIl","upnv2nn9mRsfNH4ZQaTWKpnac+13IYgzxO4qYpD0aqcnQmomv+adRKZaqxpq">()
                  );
                  this.IiIIlllliIIlll = true;
                  this.IiIilliIil(p);
                  this.IIIIllllIIIlll = false;
                  this.illIlllIilIlll = true;
                  this.lilIllliilIlll = 0;
                  return true;
               }
            } else {
               p.method_36457(Math.min(90.0F, p.method_36455() + 30.0F));
               if (++this.llIIlllilIIlll >= 4) {
                  this.llIIlllilIIlll = 0;
                  class_1269 var5 = this.lllilIlillilIl.field_1761.method_2919(p, class_1268.field_5810);
                  if (var5.method_23665()) {
                     p.method_6104(class_1268.field_5810);
                  }
               }

               this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","JDYspESwYXz9NqLH7n+GGUcHtEUlp8ggB85FI13zDRGOzL8H1Q9dn8z9W9jeCR4RJI6AK59F6h85Ba2ANetOmqw=">()
                  + (var3.method_7936() - var3.method_7919())
                  + iiIIIlIIlIIl<"iiIIIlIIlIIl","dmq/JJPmY7O6mww+I/rNWJmBAKNeIP8SC1aCRA8=">()
                  + var3.method_7936();
               return true;
            }
         } else {
            var2.method_61496(this.iIIIlllIlIIlll);
            this.IiIilliIil(p);
            this.IIIIllllIIIlll = false;
            this.IllIllllllIlll = 0;
            if (!var3.method_7960() && var3.method_7963() && var3.method_7919() == 0) {
               this.llliiillii(
                  iiIIIlIIlIIl<"iiIIIlIIlIIl","tLhdp/rhr/A8GgmHkjTzClVh9ZXJn7LnovNJihxijxDCeGhanKYwD9EPqX/PAQZFvvE3x9/HHiuSy6RRu7EaTnly/945HXbZ29CHumzE42fAIJOqhz9C1uRH">()
               );
            }

            this.illIlllIilIlll = true;
            this.lilIllliilIlll = 0;
            return true;
         }
      }
   }

   public class_2338 Iilllilliill() {
      return this.llIIiIlilIIiIl == lilIIliiilIIli.illIliiiiIilIliiii && this.iIIIiIlIlIIiIl != null && !this.iIIIiIlIlIIiIl.Iilililiiili()
         ? this.iIIIiIlIlIIiIl.Ililllililil()
         : null;
   }

   private class_2338 lIilliIill(class_1937 w, class_746 p) {
      long var16 = 6916485899994570893L;
      long var18 = 415943286735687634L;
      long var20 = -5104045307591965143L;
      class_2338 var3 = p.method_24515();
      var16 ^= ((long)this.iIIIiIlIlIIiIl.Ililllililil().method_10264() << 32 ^ var16) & -1L << 32;
      class_2338 var5 = null;
      var16 ^= ~var16 & -1L >>> 32;
      double var7 = Double.MAX_VALUE;
      var18 ^= ((long)this.iIIIiIlIlIIiIl.liiiIIllIl() << 32 ^ var18) & -1L << 32;

      while ((int)(var18 >>> 32) >= this.iIIIiIlIlIIiIl.iIlIlllllill()) {
         for (var18 ^= ((long)this.iIIIiIlIlIIiIl.IIIIllIIIl() ^ var18) & -1L >>> 32;
            (int)var18 <= this.iIIIiIlIlIIiIl.iIIIlIlIIl();
            var18 ^= (var18 ^ var18 + (long)1) & -1L >>> 32
         ) {
            for (var20 ^= ((long)this.iIIIiIlIlIIiIl.llIIlilIIl() << 32 ^ var20) & -1L << 32;
               (int)(var20 >>> 32) <= this.iIIIiIlIlIIiIl.IiIIlliIIl();
               var20 += 4294967296L
            ) {
               class_2338 var12 = this.iIIIiIlIlIIiIl.IIlilIliiIli((int)var18, (int)(var20 >>> 32), (int)(var18 >>> 32));
               if (this.IIliilIlii(w, var12) && !this.lIllIlliIllIll.containsKey(var12) && !this.IlllIllllllIll.containsKey(var12)) {
                  var20 ^= ((long)(this.IIIillIIil(w, var12) + ((int)(var18 >>> 32) == (int)(var16 >>> 32) ? 100 : 0)) ^ var20) & -1L >>> 32;
                  double var14 = var12.method_10262(var3);
                  if ((int)var20 > (int)var16 || (int)var20 == (int)var16 && var14 < var7) {
                     var16 ^= ((long)((int)var20) ^ var16) & -1L >>> 32;
                     var7 = var14;
                     var5 = var12.method_10062();
                  }
               }
            }
         }

         var18 += -4294967296L;
      }

      return var5;
   }

   private boolean liIiiiiIii(class_1937 pos, class_2338 w) {
      return this.IIliilIlii(pos, w) && !this.ilIiiIiIii(w);
   }

   private void lIlliiIlli(class_1937 w, class_2338 pos) {
      this.lIiilIliIiilIl.iIlIlllllill();
      this.lIlIiIliIlIiIl = null;
      if (this.IlIiillIii(w, pos)) {
         class_746 var3 = this.lllilIlillilIl.field_1724;
         double var4 = var3 != null ? Math.max(this.IililIllililIl.iIiiIIiliIliiIIili, var3.method_55754()) : this.IililIllililIl.iIiiIIiliIliiIIili;
         if (!this.IliilIllliilIl.IilliliilIIi(pos, var4)) {
            this.lililiilil(llliIiIiilliIiIi.liiIiIiIIi);
         } else if (var3 == null || this.iiiilIIIIi(var3, pos) || !this.IliIilliIi(var3)) {
            if (this.iIiilIliil(pos)) {
               this.lililiilil(llliIiIiilliIiIi.IIIliIiIIi);
            } else {
               this.iiliIllIIiiIll = this.ililiIlIiiliIl > 200
                  ? iiIIIlIIlIIl<"iiIIIlIIlIIl","xSHkOgYQYf9OSzF8HqJN74v5ZqHQlHKHSFskga6ZElFl00yYazg1cJgJ">()
                     + this.ililiIlIiiliIl / 20
                     + iiIIIlIIlIIl<"iiIIIlIIlIIl","Qwr8/k5o9DLMu8wpXlO/C24xGRmGCl4bCDm2ckzY">()
                  : iiIIIlIIlIIl<"iiIIIlIIlIIl","3StjM9TlbN2EmpVOFQ1DY5K37rDYRJWt8Fb+rWC2283i6oo2xeyamE1Jk38uQcagKME=">();
            }
         }
      }
   }

   public class_2338 lIiiIiIlilli() {
      return this.lIlIiIliIlIiIl;
   }

   void IIIilIIiiIIi() {
      this.lIlIiIliIlIiIl = null;
      this.IliilIllliilIl.Illillliilli();
   }

   public lllIlIIlillIlIIl IlIlllIlilIl() {
      return this.IIIIiIllIIIiIl;
   }

   public boolean Ililllililil() {
      if (this.llIIiIlilIIiIl != lilIIliiilIIli.illIliiiiIilIliiii) {
         return false;
      } else {
         class_2338 var1 = this.IliilIllliilIl.IIiilIiiiIii();
         return var1 != null && this.iIiilIliil(var1);
      }
   }

   void IiIiliIiiiIi() {
      this.lIlIiIliIlIiIl = null;
      this.IliilIllliilIl.Iilililiiili();
   }

   private void IIiillIiil() {
      this.lIiliIliIiliIl = llliIiIiilliIiIi.IiiIiIiIIi;
      this.ililiIlIiiliIl = 0;
      this.liiliIliiiliIl = 0;
      this.lIliiIliIliiIl = null;
      this.IlliiIlllliiIl = this.IIilIlllIilIll > 0;
      this.iIilIllIlilIll.clear();
   }

   private boolean iiiilIIIIi(class_746 pos, class_2338 p) {
      long var6 = -1398376562658687017L;
      var6 ^= ((long)this.iIIIiIlIlIIiIl.Iiilliiliiil() << 32 ^ var6) & -1L << 32;
      double var4 = this.iIIIiIlIlIIiIl.lIIlllilIl == class_2351.field_11048
         ? pos.method_23321() - ((double)((int)(var6 >>> 32)) + 0.5)
         : pos.method_23317() - ((double)((int)(var6 >>> 32)) + 0.5);
      return Math.abs(var4) > 0.22 ? false : Math.abs(this.lIIIiiIIIi(pos, p)) >= 0.7;
   }

   private void IIiIllIiIl() {
      class_746 var1 = this.lllilIlillilIl.field_1724;
      if (var1 != null && this.IiIIiIlliIIiIl != null && var1.field_3913 == this.lIiilIliIiilIl) {
         var1.field_3913 = this.IiIIiIlliIIiIl;
      }

      this.IiIIiIlliIIiIl = null;
      this.lIiilIliIiilIl.iIlIlllllill();
      this.lIiilIliIiilIl.IilliliilIIi();
   }

   public String llIIlilIIl() {
      long var17 = -1175568952834260982L;
      long var11 = -9022034770842351169L;
      long var13 = -1923738034190330336L;
      long var15 = 1504242385937280203L;
      class_746 var1 = this.lllilIlillilIl.field_1724;
      if (var1 == null || this.lllilIlillilIl.field_1687 == null) {
         return iiIIIlIIlIIl<"iiIIIlIIlIIl","HRql8Sd55N042Yg7PBKIbQSF8o4ggBPQr8yiEonjQNsQN5onJzi7SFBl">();
      } else if (this.llIIiIlilIIiIl == lilIIliiilIIli.illIliiiiIilIliiii) {
         return iiIIIlIIlIIl<"iiIIIlIIlIIl","nWDKeJ0mWRHQBHQCckU5FhzUMXF7OtiJOxEiAyCcPLaa7nA/eMIBjOLw">();
      } else if (this.llIIiIlilIIiIl == lilIIliiilIIli.lilIliiiiiilIliiii) {
         this.illIlIilIl();
         this.llliiillii(iiIIIlIIlIIl<"iiIIIlIIlIIl","kgI+pj0UoMIDxlYQvtW1AIRKenhrGpQXyhrd+kzkoOS7zNqFITtSrSyApe8XKtDD9VGsCdrPnflN">());
         return null;
      } else if (!this.iililIlIIiilIl.IIIllIIliIIl()) {
         return iiIIIlIIlIIl<"iiIIIlIIlIIl","Cw1fsFPuz7XyVjy1kmsYEmiZ9WJLVfDU12T06nJT+ia/kOI3RFVugWD2ZzVK//IKyQs=">();
      } else {
         var11 ^= (
               (long)(this.iIIIiIlIlIIiIl != null && !this.iIIIiIlIlIIiIl.Illillliilli() && this.iIIIiIlIlIIiIl.IIiIllIiIl(this.iililIlIIiilIl) ? 1 : 0) << 32
                  ^ var11
            )
            & -1L << 32;
         if ((int)(var11 >>> 32) != 0) {
            this.llliiillii(
               iiIIIlIIlIIl<"iiIIIlIIlIIl","cA2AcruhltY8MgGDqTeoe6HBGc+QJrxjikh/vBYae9ILXXFek8fR007XpsxXrit32Tw/K1UMbzBYaHbo">()
                  + this.iIIIiIlIlIIiIl.lilIliilIl()
            );
            this.IliliIllliliIl = null;
            this.IIilIlllIilIll = 0;
            this.IilIililIi();
            this.IIiiiIllIiiiIl.clear();
            this.iIiiiIlIliiiIl = null;
            this.lliiiIliliiiIl = null;
            this.IiiiiIlliiiiIl = 0;
            this.IIiillIiil();
            this.lliliilili();
         } else {
            this.lilIliilIl();
            var11 ^= ((long)(this.iililIlIIiilIl.Ililllililil() >= this.iililIlIIiilIl.IIIilIIiiIIi() ? 1 : 0) ^ var11) & -1L >>> 32;
            class_2338 var4 = var1.method_24515();
            var13 ^= ((long)((int)var11 != 0 ? var4.method_10263() : var4.method_10260()) << 32 ^ var13) & -1L << 32;
            var13 ^= ((long)((int)var11 != 0 ? var4.method_10260() : var4.method_10263()) ^ var13) & -1L >>> 32;
            var15 ^= ((long)((int)var11 != 0 ? this.iililIlIIiilIl.IlIlllIlilIl() : this.iililIlIIiilIl.IIlllIlliIll()) << 32 ^ var15) & -1L << 32;
            var15 ^= ((long)((int)var11 != 0 ? this.iililIlIIiilIl.Illlllllilll() : this.iililIlIIiilIl.IIillIiliIil()) ^ var15) & -1L >>> 32;
            var17 ^= ((long)((int)var11 != 0 ? this.iililIlIIiilIl.IIlllIlliIll() : this.iililIlIIiilIl.IlIlllIlilIl()) << 32 ^ var17) & -1L << 32;
            var17 ^= ((long)((int)var11 != 0 ? this.iililIlIIiilIl.IIillIiliIil() : this.iililIlIIiilIl.Illlllllilll()) ^ var17) & -1L >>> 32;
            this.iIIIiIlIlIIiIl = new iIiiiIIlIliiiIIl(
               this.iililIlIIiilIl,
               this.IililIllililIl.lIliIIiliiIliIIili,
               this.IililIllililIl.IlliIIilillliIIili,
               Math.abs((int)var13 - (int)var17) < Math.abs((int)var13 - (int)(var17 >>> 32)),
               Math.abs((int)(var13 >>> 32) - (int)var15) < Math.abs((int)(var13 >>> 32) - (int)(var15 >>> 32))
            );
            this.IIIIiIllIIIiIl = new lllIlIIlillIlIIl(this.lllilIlillilIl, this.IililIllililIl, this.lIiilIliIiilIl, this.IliilIllliilIl, this.iililIlIIiilIl);
            this.lllliIlillliIl = 0;
            this.IilliIllilliIl = 0;
            this.illiiIlIiliiIl = -1;
            this.iilliIlIIiliIl = false;
            this.lIiliIliIiliIl = llliIiIiilliIiIi.IiiIiIiIIi;
            this.IliliIllliliIl = null;
            this.ililiIlIiiliIl = 0;
            this.lIliiIliIliiIl = null;
            this.IIilIlllIilIll = 0;
            this.iIilIllIlilIll.clear();
            this.llilIllililIll = 0;
            this.IlIiIllllIiIll = 0;
            this.IiIlIllliIlIll.clear();
            this.iiIlIllIIllIll.clear();
            this.IliilIllliilIl.liiiIIllIl();
            this.IiilIllliilIll = false;
            this.ilIiIllIiIiIll = false;
            this.iiliIllIIiiIll = "";
            this.illIiIlIilIiIl.clear();
            this.lilIiIliilIiIl.clear();
            this.IIiIiIllIiIiIl.clear();
            this.iIlliIlIllliIl.clear();
            this.IIiiiIllIiiiIl.clear();
            this.iIiiiIlIliiiIl = null;
            this.IilIililIi();
            this.lliliilili();
         }

         this.IiIIlliIIl();
         this.iIiIiIlIliIiIl = 0;
         this.lliIiIliliIiIl = false;
         this.IiiIiIlliiIiIl = false;
         this.iiiIiIlIIIliIl = false;
         this.lIIliIliIIliIl.clear();
         this.IIIiiIllIIiiIl = 20;
         this.IiIIiIlliIIiIl = var1.field_3913;
         var1.field_3913 = this.lIiilIliIiilIl;
         this.llIIiIlilIIiIl = lilIIliiilIIli.illIliiiiIilIliiii;
         if (!this.IililIllililIl.ilIIlIiliIiIIlIili && this.IliilIllliilIl.IIIllIIliIIl(var1) < 0) {
            this.llliiillii(
               iiIIIlIIlIIl<"iiIIIlIIlIIl","EZdTmCIevAGbjL6RMjWcgSqSBwEjlqHeiT9ZKYoVjRLMjzeEJb298DUpIa4Yq/E2QPN5sgEVRAOzqEaK2YF7HNnk">()
                  + this.IililIllililIl.IlIIlIilillIIlIili
                  + iiIIIlIIlIIl<"iiIIIlIIlIIl","LVPNc6UUkkAit0OI07MbjIbClBRZdv9mo0xsndnxHySiBzCCVHPK5lPDdMwkg21v/4Hn7NWhER7Msu6NqMv2WD4nFe+l2CDd0oB602Jx7NGBNM8SO1zlALYLtuxUo+6JQ04MrPTXqpkoD/iNG5cE8vX/d36DOD2dv6W1bKXBFWu3RTms8p9OchMmJk08aVi53MLhYg==">()
            );
         }

         return null;
      }
   }

   public void illIlIilIl() {
      if (this.llIIiIlilIIiIl == lilIIliiilIIli.lilIliiiiiilIliiii) {
         this.llIIiIlilIIiIl = lilIIliiilIIli.illIliiiiIilIliiii;
         this.iiIIiIlIIlIiIl = false;
         this.illIiIlIilIiIl.clear();
         this.iIlliIlIllliIl.clear();
         this.IIiiiIllIiiiIl.clear();
         this.iIiiiIlIliiiIl = null;
         this.IilIililIi();
         this.IliliIllliliIl = null;
         this.IIilIlllIilIll = 0;
         this.IIiillIiil();
         this.lliliilili();
      } else if (this.llIIiIlilIIiIl == lilIIliiilIIli.IllIliiiilllIliiii && this.iIIIiIlIlIIiIl != null && !this.iIIIiIlIlIIiIl.Illillliilli()) {
         String var1 = this.llIIlilIIl();
         if (var1 != null) {
            this.llliiillii(iiIIIlIIlIIl<"iiIIIlIIlIIl","RrPb5WhPHXZt6Z6JjzkmqW833yaa0ZJpsTJIVM2XBA==">() + var1);
         }
      }
   }

   private boolean iIiilIliil(class_2338 pos) {
      if (this.lllilIlillilIl.field_1765 instanceof class_3965 var3 && var3.method_17783() == class_240.field_1332 && var3.method_17777().equals(pos)) {
         return true;
      }

      return false;
   }

   private void iiIliIIlli(class_1937 fc, class_2338 w) {
      long var11 = -5799466550280555524L;
      long var13 = 5551207247706446362L;
      class_746 var3 = this.lllilIlillilIl.field_1724;
      var11 ^= ((long)(var3 != null && lllIIlilillIIlil.iliIiiliiiii(fc, var3.method_24515().method_10074()) ? 1 : 0) << 32 ^ var11) & -1L << 32;
      double var5 = 0.0;
      if (var3 != null && this.iIIIiIlIlIIiIl != null) {
         double var7 = (double)this.iIIIiIlIlIIiIl.Iiilliiliiil() + 0.5;
         var5 = (this.iIIIiIlIlIIiIl.lIIlllilIl == class_2351.field_11048 ? var3.method_23321() : var3.method_23317()) - var7;
      }

      var11 ^= (
            (long)(
                  var3 == null
                        || (int)(var11 >>> 32) == 0
                        || this.IIIIiIllIIIiIl.lIiiIiIlilli()
                        || !this.IliilIllliilIl.IIlllIlliIll(w, this.IililIllililIl.iIiiIIiliIliiIIili)
                        || this.IIilIlllIilIll <= 0 && !this.Iiiilliiil(var3, w)
                     ? 0
                     : 1
               )
               ^ var11
         )
         & -1L >>> 32;
      if ((int)var11 != 0 && Math.abs(var5) <= 0.22) {
         if (this.IIIIiIllIIIiIl.iliIiiliiiii()) {
            this.IIIIiIllIIIiIl.IIIllIIliIIl();
         }

         this.lIiilIliIiilIl.iIlIlllllill();
         this.lililiilil(llliIiIiilliIiIi.iiiIiIiIIi);
      } else {
         if ((int)var11 != 0 && Math.abs(var5) <= 0.35) {
            if (this.IIIIiIllIIIiIl.iliIiiliiiii()) {
               this.IIIIiIllIIIiIl.IIIllIIliIIl();
            }

            if (this.IliIilliIi(var3)) {
               this.lIlIiIliIlIiIl = null;
               return;
            }

            if (Math.abs(var5) <= 0.22) {
               this.lIiilIliIiilIl.iIlIlllllill();
               this.IIilIlllIilIll = 0;
               this.lililiilil(llliIiIiilliIiIi.iiiIiIiIIi);
               return;
            }
         }

         class_2338 var8;
         if (this.IlliiIlllliiIl) {
            var8 = this.iIIIiIlIlIIiIl.IiIiliIiiiIi();
         } else {
            var13 ^= ((long)this.iIIIiIlIlIIiIl.IIIIllIIIl() << 32 ^ var13) & -1L << 32;
            var13 ^= ((long)this.iIIIiIlIlIIiIl.iIIIlIlIIl() ^ var13) & -1L >>> 32;
            if ((int)var13 - (int)(var13 >>> 32) >= 2
               && (this.iIIIiIlIlIIiIl.IiIlliIliiIl() == (int)(var13 >>> 32) || this.iIIIiIlIlIIiIl.IiIlliIliiIl() == (int)var13)) {
               var8 = this.iIIIiIlIlIIiIl.IIlilIliiIli(this.iIIliIlIli(), this.iIIIiIlIlIIiIl.Iiilliiliiil(), this.iIIIiIlIlIIiIl.iIlIlllllill());
            } else {
               var8 = this.iIIIiIlIlIIiIl.IlIillIiilIi();
            }
         }

         if (var3 == null || !this.Iliilliiilii(fc, var3, var8)) {
            if (var3 == null || !lllIIlilillIIlil.liiiIIllIl(fc, var8.method_10074()) && !this.IIiilIiiiIii(var3, var8)) {
               lillilliillill var9 = this.IIIIiIllIIIiIl.IIlilIliiIli(var8);
               if (var9 == lillilliillill.ilIilIlIiIiIilIlIi) {
                  this.iiliIllIIiiIll = this.IIIIiIllIIIiIl.lIiiIiIlilli()
                     ? iiIIIlIIlIIl<"iiIIIlIIlIIl","9PriZ3Z0CyHVDWykrlpiguV9508rO+tdUzH6kc9+DG7+zSFizo3G">()
                     : (
                        this.IIIIiIllIIIiIl.iliIiiliiiii()
                           ? iiIIIlIIlIIl<"iiIIIlIIlIIl","5Jd46FUg1NJD25k1Etg3/8mTM3RVe9AFAOAvwLyGAqoM6FLi">()
                           : (
                              this.IlliiIlllliiIl
                                 ? iiIIIlIIlIIl<"iiIIIlIIlIIl","eO5zUUlh3km9rypS9RkQcaZRPgA1+2Tn2i6wz50iE5sG/Aa9CHJaf/Vtrdq5cGtR">()
                                 : iiIIIlIIlIIl<"iiIIIlIIlIIl","auwg9TuWBM619egVbTPR3NDXnYxyuVBwmgZVajBUPycPsw4pE7BvaJPDZ0+nQ0G3+0rNOiE=">()
                           )
                     );
                  this.lIlIiIliIlIiIl = null;
               } else if (var9 == lillilliillill.IIlilIlIilIlilIlIi) {
                  if (var3 == null || !this.IIIlilIIli(fc, var3, w, Math.max(this.IililIllililIl.iIiiIIiliIliiIIili, var3.method_55754()))) {
                     if (this.IIilIlllIilIll == 0 && !this.IlliiIlllliiIl) {
                        this.IIilIlllIilIll = 3;
                        this.IlliiIlllliiIl = true;
                        this.IIIIiIllIIIiIl.IliIlllilIi();
                        this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","rI9gTwiQwEiCPNcvxuXfR601L+C15pXQCkwJ3XP48nUw17lgr+aYs7m4/gxLcrWjSRMsY1FlAQ==">();
                     } else {
                        this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","UMHb/IIcjEvI/ok+mhPuAFoCxSayS/Sb3VHCMwpdCYeZEvufnay4RfR4JuuQYnDoX3FfUh0mdEYOahKEmy9BT5Wu0j37/2+jEg==">();
                        this.lililiilil(llliIiIiilliIiIi.liiIiIiIIi);
                     }
                  }
               } else {
                  this.lIiilIliIiilIl.iIlIlllllill();
                  this.IIilIlllIilIll = 0;
                  this.lililiilil(llliIiIiilliIiIi.iiiIiIiIIi);
               }
            } else {
               this.iIilIllIlilIll.add(var8.method_10062());
               this.IIIIiIllIIIiIl.IliIlllilIi();
               this.IIliIlllIliIll = null;
               if (++this.IiliIllliliIll >= 3) {
                  this.IiliIllliliIll = 0;
                  this.lIllIlliIllIll.put(w.method_10062(), 1200);
                  this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","ksvIjaz6DZsgxJYDWEdoLhjYMMlPfBpyCJVbgG/N/7D3AxA4WHI20mxrDDIyB7xXFfvBM9SdDRQ79g7927F5vS9iYeZ09gPb9jpLuoNHbfBWRXDUPiND7pQjXRM7uUTgO7+PZA==">();
               } else {
                  this.lililiilil(llliIiIiilliIiIi.liiIiIiIIi);
                  this.iiliIllIIiiIll = lllIIlilillIIlil.liiiIIllIl(fc, var8.method_10074())
                     ? iiIIIlIIlIIl<"iiIIIlIIlIIl","DZ5yOnO/aYpURAo7NO45eAJTb59QKpE5cNDQkTKLHcDyE/NwSIoTFfRQUpC+PCvRvAawnobROuzi1AGMRczv1+aiJqw0TtqITXTOFaZrKZV6Zn54QH6KDw==">()
                     : iiIIIlIIlIIl<"iiIIIlIIlIIl","Ro1qFkcMuz9P3dyoOa9JWa93dkXBR8FwStCmq4Y8eLbX8L0rpVbItYnvRpY/PwK6h0fWBfidAy/Fng4HQhBC5U7zaLZLBKCXNiQ=">();
               }
            }
         }
      }
   }

   private void lIIlliIIll(class_746 p, class_1937 w) {
      long var4 = 7102846291726977586L;
      if (this.IiiIiIlliiIiIl) {
         this.iIlllIllll(p, w);
      } else if (!this.iIIIiIlIlIIiIl.Iilililiiili()) {
         this.lliililiil(w);
      } else if (!this.IlIllllIll(p, w)) {
         var4 ^= ((long)(this.iIIIiIlIlIIiIl.iiIIlIIlIl() + 1) << 32 ^ var4) & -1L << 32;
         this.lliliilili();
         this.illIiIlIilIiIl.clear();
         this.iIlliIlIllliIl.clear();
         this.IIIIiIllIIIiIl.IilliliilIIi();
         this.IIiiiIllIiiiIl.clear();
         this.lIIlllliIIllll = false;
         if (this.iIIIiIlIlIIiIl.Iliilliiilii()) {
            this.llliiillii(
               iiIIIlIIlIIl<"iiIIIlIIlIIl","NtJ7yEagjNFCo+vStAcvQx9awxvYheerJy2jxb/qXJPvqw==">()
                  + (int)(var4 >>> 32)
                  + iiIIIlIIlIIl<"iiIIIlIIlIIl","bAXjL3zAkIs21i6b7SGuJ71z+KsNFSCzIfVo6l642/Rnl7gfaum69JleMD/Pc19DL1Lhvivo2iSdJzye">()
                  + (this.iIIIiIlIlIIiIl.iiIIlIIlIl() + 1)
            );
            this.iiliIllIIiiIll = "";
            this.IlIIIllllIIIll = 0;
            this.ilIIiIiIIi(p);
         } else if (this.IililIllililIl.IIiiIIililIiiIIili) {
            this.IIllllIlll();
         } else {
            this.iIiIlIliIl(-1);
         }
      }
   }

   public void iiIIlIIlIl() {
      this.iiIIiIlIIlIiIl = false;
      if (this.llIIiIlilIIiIl == lilIIliiilIIli.illIliiiiIilIliiii) {
         this.llIIiIlilIIiIl = lilIIliiilIIli.lilIliiiiiilIliiii;
         this.lIiilIliIiilIl.iIlIlllllill();
         this.IliilIllliilIl.Iilililiiili();
      }
   }

   private void Iiililiili() {
      this.lIlIiIliIlIiIl = null;
      this.IliilIllliilIl.Iilililiiili();
   }

   public void lilIliilIl() {
      this.IIiIllIiIl();
      this.IliilIllliilIl.Iilililiiili();
      this.lIlIiIliIlIiIl = null;
      this.iiIIiIlIIlIiIl = false;
      this.liiilIliiiilIl.lIiiIiIlilli();
      this.iliilIlIiiilIl.IliIlllilIi();
      class_746 var1 = this.lllilIlillilIl.field_1724;
      if (var1 != null) {
         this.IiIilliIil(var1);
      }

      this.IIIIllllIIIlll = false;
      this.llIIiIlilIIiIl = this.iIIIiIlIlIIiIl != null && this.iIIIiIlIlIIiIl.Illillliilli()
         ? lilIIliiilIIli.IIiIliiiilIiIliiii
         : lilIIliiilIIli.IllIliiiilllIliiii;
   }

   public iIiIlIliIl(class_310 config, ilIIIIiIiIIIIi mc, llilIIIiililIIIi selection) {
      this.llIIiIlilIIiIl = lilIIliiilIIli.IllIliiiilllIliiii;
      this.illIiIlIilIiIl = new HashSet<>();
      this.lilIiIliilIiIl = new HashSet<>();
      this.IIiIiIllIiIiIl = new HashSet<>();
      this.lIIliIliIIliIl = new ArrayList<>();
      this.iIlliIlIllliIl = new HashSet<>();
      this.lIiliIliIiliIl = llliIiIiilliIiIi.IiiIiIiIIi;
      this.illiiIlIiliiIl = -1;
      this.IIiiiIllIiiiIl = new ArrayDeque<>();
      this.IiIlIllliIlIll = new HashSet<>();
      this.iiIlIllIIllIll = new HashMap<>();
      this.lIllIlliIllIll = new HashMap<>();
      this.IlllIllllllIll = new HashMap<>();
      this.illlIllIillIll = new HashMap<>();
      this.iIilIllIlilIll = new HashSet<>();
      this.iiliIllIIiiIll = "";
      this.iIIIlllIlIIlll = -1;
      this.lIlIllliIlIlll = Integer.MAX_VALUE;
      this.IIiIllllIiIlll = -1;
      this.lliIllliliIlll = -1;
      this.lllilIlillilIl = config;
      this.IililIllililIl = mc;
      this.iililIlIIiilIl = selection;
      this.IliilIllliilIl = new liiiliIliiiiliIl(config, mc);
      this.iliilIlIiiilIl = new lIIIliiliIIIliil(this, config);
      this.liiilIliiiilIl = new iIIiIliIlIiIli(config, mc);
      this.IIIIiIllIIIiIl = new lllIlIIlillIlIIl(config, mc, this.lIiilIliIiilIl, this.IliilIllliilIl, selection);
      this.IliilIllliilIl.iIlIlllllill(this::IIIIllIIIl);
      ClientTickEvents.END_CLIENT_TICK.register((EndTick)client -> this.iiIilIIlil());
   }

   private class_2338 lllllillll(class_746 p) {
      class_2338 var2 = p.method_24515();
      class_2338 var3 = null;
      double var4 = Double.MAX_VALUE;

      for (class_2338 var7 : this.lIIliIliIIliIl) {
         if (!this.lIllIlliIllIll.containsKey(var7) && !this.IlllIllllllIll.containsKey(var7)) {
            double var8 = var7.method_10262(var2) - (double)var7.method_10264() * 0.5;
            if (var8 < var4) {
               var4 = var8;
               var3 = var7;
            }
         }
      }

      return var3;
   }

   public lilIIliiilIIli IliIlllilIi() {
      return this.llIIiIlilIIiIl;
   }

   private double lIIIiiIIIi(class_746 p, class_2338 pos) {
      return this.iIIIiIlIlIIiIl.lIIlllilIl == class_2351.field_11048
         ? p.method_23317() - ((double)pos.method_10263() + 0.5)
         : p.method_23321() - ((double)pos.method_10260() + 0.5);
   }

   private static float iliIiIiiIi(double v) {
      if (Math.abs(v) < 0.04) {
         return 0.0F;
      } else {
         return v > 0.0 ? 1.0F : -1.0F;
      }
   }

   private static boolean IlIIillIIi(class_746 p, class_2338 pos, double maxDeg) {
      class_243 var4 = p.method_33571();
      double var5 = (double)pos.method_10264() + 0.5 - var4.field_1351;
      double var7 = Math.hypot((double)pos.method_10263() + 0.5 - var4.field_1352, (double)pos.method_10260() + 0.5 - var4.field_1350);
      return Math.abs(Math.toDegrees(Math.atan2(var5, var7))) <= maxDeg;
   }

   public boolean liiiIIllIl() {
      return this.llIIiIlilIIiIl == lilIIliiilIIli.illIliiiiIilIliiii || this.llIIiIlilIIiIl == lilIIliiilIIli.lilIliiiiiilIliiii;
   }

   private static int Illillllil(class_1661 inv, class_1792 item) {
      long var3 = 8118157587625206721L;

      for (long var5 = var3 ^ (38654705664L ^ var3) & -1L << 32; (int)(var5 >>> 32) < 36; var5 += 4294967296L) {
         if (inv.method_5438((int)(var5 >>> 32)).method_7909() == item) {
            return (int)(var5 >>> 32);
         }
      }

      return -1;
   }

   private class_2350 IIlIilIlIi() {
      if (this.iIIIiIlIlIIiIl.lIIlllilIl == class_2351.field_11048) {
         return this.iIIIiIlIlIIiIl.IlIlllIlilIl() > 0 ? class_2350.field_11034 : class_2350.field_11039;
      } else {
         return this.iIIIiIlIlIIiIl.IlIlllIlilIl() > 0 ? class_2350.field_11035 : class_2350.field_11043;
      }
   }

   void Iiilliiliiil(String s) {
      this.iiliIllIIiiIll = s;
   }

   private class_2338 iIliiIllii(class_1937 w, class_746 pos, class_2338 p) {
      long var17 = -712683163615128895L;
      long var19 = -7887883092750334208L;
      long var21 = 5037015855467494728L;
      if (this.iIIIiIlIlIIiIl != null) {
         class_2338 var4 = !this.IIiiiIllIiiiIl.isEmpty()
            ? this.iIIIiIlIlIIiIl.IIlilIliiIli(this.iIIliIlIli(), this.iIIIiIlIlIIiIl.Iiilliiliiil(), this.iIIIiIlIlIIiIl.iIlIlllllill())
            : this.iIIIiIlIlIIiIl.IlIillIiilIi();
         if (!this.iIilIllIlilIll.contains(var4)
            && lllIIlilillIIlil.IIIllIIliIIl(w, var4)
            && this.IliilIllliilIl.Illlllllilll(var4, p, this.IililIllililIl.iIiiIIiliIliiIIili)) {
            return var4;
         }
      }

      var17 ^= ((long)(this.iIIIiIlIlIIiIl != null ? this.iIIIiIlIlIIiIl.Iiilliiliiil() : -1) << 32 ^ var17) & -1L << 32;
      class_2338 var5 = null;
      double var6 = Double.MAX_VALUE;

      for (long var25 = var17 ^ (0L ^ var17) & -1L >>> 32; (int)var25 <= 2; var25 ^= (var25 ^ var25 + (long)1) & -1L >>> 32) {
         if ((int)var25 == 0) {
            for (var19 ^= (-17179869184L ^ var19) & -1L << 32; (int)(var19 >>> 32) <= -1; var19 += 4294967296L) {
               class_2338 var23 = p.method_10086((int)(var19 >>> 32));
               if (this.iililIlIIiilIl.IlIillIiilIi(var23)
                  && !this.iIilIllIlilIll.contains(var23)
                  && lllIIlilillIIlil.IIIllIIliIIl(w, var23)
                  && this.IliilIllliilIl.Illlllllilll(var23, p, this.IililIllililIl.iIiiIIiliIliiIIili)) {
                  double var11 = var23.method_10262(pos.method_24515()) + (double)(Math.abs(var23.method_10264() - pos.method_31478()) * 25);
                  if (var11 < var6) {
                     var6 = var11;
                     var5 = var23;
                  }
               }
            }
         } else {
            for (class_2350 var10 : class_2353.field_11062) {
               for (var19 ^= (-4L ^ var19) & -1L >>> 32; (int)var19 <= 1; var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32) {
                  class_2338 var12 = p.method_10079(var10, (int)var25).method_10086((int)var19);
                  if (this.iililIlIIiilIl.IlIillIiilIi(var12)
                     && !this.iIilIllIlilIll.contains(var12)
                     && lllIIlilillIIlil.IIIllIIliIIl(w, var12)
                     && this.IliilIllliilIl.Illlllllilll(var12, p, this.IililIllililIl.iIiiIIiliIliiIIili)) {
                     var21 ^= (
                           (long)(
                                    this.iIIIiIlIlIIiIl != null && this.iIIIiIlIlIIiIl.lIIlllilIl == class_2351.field_11048
                                       ? var12.method_10260()
                                       : var12.method_10263()
                                 )
                                 << 32
                              ^ var21
                        )
                        & -1L << 32;
                     var21 ^= ((long)((int)(var25 >>> 32) != -1 ? Math.abs((int)(var21 >>> 32) - (int)(var25 >>> 32)) : 0) ^ var21) & -1L >>> 32;
                     if ((int)var21 <= 1) {
                        double var15 = var12.method_10262(pos.method_24515())
                           + (double)(Math.abs(var12.method_10264() - pos.method_31478()) * 25)
                           + (double)((int)var21 * 500);
                        if (var15 < var6) {
                           var6 = var15;
                           var5 = var12;
                        }
                     }
                  }
               }
            }
         }

         if (var5 != null) {
            return var5;
         }
      }

      class_2338 var8 = p.method_10084();
      return !this.iIilIllIlilIll.contains(var8) && lllIIlilillIIlil.IIIllIIliIIl(w, var8) ? var8 : null;
   }

   private void iiiIlIIIll() {
      long var11 = 7776831084866997294L;
      long var13 = -5911616498509052020L;
      if (this.llIIiIlilIIiIl == lilIIliiilIIli.illIliiiiIilIliiii) {
         class_746 var1 = this.lllilIlillilIl.field_1724;
         class_638 var2 = this.lllilIlillilIl.field_1687;
         if (var1 != null && var2 != null) {
            if (var1.field_3913 != this.lIiilIliIiilIl) {
               this.IiIIiIlliIIiIl = var1.field_3913;
               var1.field_3913 = this.lIiilIliIiilIl;
            }

            this.lIiilIliIiilIl.iIlIlllllill();
            if (!this.iliilIlIiiilIl.iIlIlllllill()) {
               if (this.lIlIiIliIlIiIl != null && var2.method_8320(this.lIlIiIliIlIiIl).method_26215()) {
                  this.lllliIlillliIl++;
                  this.ilillIiill(this.lIlIiIliIlIiIl);
                  class_2338 var3 = this.lIlIiIliIlIiIl.method_10062();
                  var11 ^= ((long)this.illlIllIillIll.merge(var3, 1, Integer::sum).intValue() << 32 ^ var11) & -1L << 32;
                  if ((int)(var11 >>> 32) >= 3) {
                     this.lIllIlliIllIll.put(var3, 2400);
                     this.illlIllIillIll.remove(var3);
                     this.llliiillii(
                        iiIIIlIIlIIl<"iiIIIlIIlIIl","q94g6jbsu/lyZ06DSDisDuAqU42kdFJInMuR/grfHg==">()
                           + var3.method_23854()
                           + iiIIIlIIlIIl<"iiIIIlIIlIIl","aWePyAGmCGuilaidKNGo6Q0GiL/XJUUByYLIzT8IKodxNQiTfnCSzmWKeJRG4UQWiB+ZzBPdS7LPWuKjvjaL0mRc5hGGP/XXuSgvniKc148rsJRHyss=">()
                     );
                  }

                  this.lIlIiIliIlIiIl = null;
                  this.IliilIllliilIl.Illillliilli();
               }

               if (!this.lIllIlliIllIll.isEmpty()) {
                  this.lIllIlliIllIll.replaceAll((k, v) -> v - 1);
                  this.lIllIlliIllIll.values().removeIf(v -> v <= 0);
               }

               if (!this.IlllIllllllIll.isEmpty()) {
                  this.IlllIllllllIll.replaceAll((k, v) -> v - 1);
                  this.IlllIllllllIll.values().removeIf(v -> v <= 0);
               }

               if (++this.lillIlliillIll >= 600) {
                  this.lillIlliillIll = 0;
                  this.illlIllIillIll.clear();
               }

               if (this.lIIIIlliIIIIll != null || this.ilIIIllIiIIIll) {
                  this.iIlIIllIllIIll++;
               }

               if (!this.IIiiiIllIiiiIl.isEmpty()) {
                  this.iiiiiIlIIIIIll++;
               }

               double var15 = var1.method_23317() - this.llIiiIlilIiiIl;
               double var5 = var1.method_23318() - this.IiIiiIlliIiiIl;
               double var7 = var1.method_23321() - this.iiIiiIlIIliiIl;
               this.iIIiiIlIlIiiIl = var15 * var15 + var5 * var5 + var7 * var7 > 0.0025;
               this.llIiiIlilIiiIl = var1.method_23317();
               this.IiIiiIlliIiiIl = var1.method_23318();
               this.iiIiiIlIIliiIl = var1.method_23321();
               if (this.IIIiiIllIIiiIl <= 0) {
                  this.IIIIiIllIIIiIl.IiIIlliIIl(this.iIIIiIlIlIIiIl.Ililllililil().method_10264());
                  this.IIIIiIllIIIiIl.iiIIlIIlIl(var1.method_55754());
                  if (!this.iIIilIlIil(var1)) {
                     if (!this.illilIilil(var1)) {
                        if (this.iilliIlIIiliIl && !this.IIIIiIllIIIiIl.lIiiIiIlilli()) {
                           this.lililiilil(llliIiIiilliIiIi.iiiIiIiIIi);
                        }

                        this.iilliIlIIiliIl = this.IIIIiIllIIIiIl.lIiiIiIlilli();
                        if (this.IililIllililIl.liliIIiliiiliIIili
                           && !this.ilIiIllIiIiIll
                           && this.IIIIiIllIIIiIl.lIiiIiIlilli()
                           && !liliIliiiliIli.IIIllIIliIIl(var1)) {
                           this.ilIiIllIiIiIll = true;
                           this.llliiillii(
                              iiIIIlIIlIIl<"iiIIIlIIlIIl","QGAWW5U7v6dUYAtqqAzdpVyIx4q1unmt7Ic/p+OIWhsanKoA3DP/CalfexOEJUYznEZUz5BOAECocwCpe9zirM1uJDKXIfiUGScviBousZGl7VHWurY777Fznvvfk4IA5tjel+ju2u9Ly+KOsI8XBv2/CXKudnIXF6GDEg==">()
                           );
                        }

                        if (!this.iilIiIIiIi(var2, var1)) {
                           if (!this.liIIiiiIIi(var2, var1)) {
                              this.lIIlliIIll(var1, var2);
                           }
                        }
                     }
                  }
               } else {
                  this.IIIiiIllIIiiIl--;
                  this.lIiilIliIiilIl.iIlIlllllill();
                  this.IliilIllliilIl.Iilililiiili();
                  var11 ^= (0L ^ var11) & -1L >>> 32;

                  while (this.liilliiill(var2, 1) == 0) {
                     int var10000 = (int)var11;
                     var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32;
                     if (var10000 >= this.iIIIiIlIlIIiIl.lIlIliIlIl()) {
                        break;
                     }

                     var13 ^= ((long)(this.iIIIiIlIlIIiIl.iiIIlIIlIl() + 1) << 32 ^ var13) & -1L << 32;
                     if (!this.iIIIiIlIlIIiIl.Iliilliiilii()) {
                        this.llliiillii(
                           iiIIIlIIlIIl<"iiIIIlIIlIIl","LtuWbeIIMriH3gN8tJbUBvQKzKRgRsqU0BvVFBJ5phkKpcCplaY+sq/Wtelh7L7Rg+S4VIuqKDYJvfRa4hpFzFrkiLGrgyVb5EKEI5976Q==">()
                        );
                        this.iIiIlIliIl(0);
                        return;
                     }

                     this.llliiillii(
                        iiIIIlIIlIIl<"iiIIIlIIlIIl","NtJ7yEagjNFCo+vStAcvQx9awxvYheerJy2jxb/qXJPvqw==">()
                           + (int)(var13 >>> 32)
                           + iiIIIlIIlIIl<"iiIIIlIIlIIl","K9FWJbFfEIuCT339r3YjxByGujaCYZuH84yfrAhoYc69I49wLrIB2YuFtaEaIaUOmFOouhqzpX7E+jvMa52C0X2f4Kw=">()
                           + (this.iIIIiIlIlIIiIl.iiIIlIIlIl() + 1)
                     );
                     this.lliliilili();
                     this.IIiiiIllIiiiIl.clear();
                     this.IilIililIi();
                  }

                  if (this.IIIiiIllIIiiIl == 0 && this.iIIIiIlIlIIiIl.Iilililiiili() && !this.lIIlllliIIllll && this.liilliiill(var2, 20) >= 20) {
                     this.lIIlllliIIllll = true;
                     this.iIIIiIlIlIIiIl.Iiiiliiiiiii();
                     this.IliliIllliliIl = null;
                     this.IIilIlllIilIll = 0;
                     this.IIiillIiil();
                     this.lliliilili();
                     this.llliiillii(
                        iiIIIlIIlIIl<"iiIIIlIIlIIl","NtJ7yEagjNFCo+vStAcvQx9awxvYheerJy2jxb/qXJPvqw==">()
                           + (this.iIIIiIlIlIIiIl.iiIIlIIlIl() + 1)
                           + iiIIIlIIlIIl<"iiIIIlIIlIIl","rBmxR41fvBrasgcs+AwX/uEa+T4+GPFdzn7cxPNlebmK2cXrfv1kKNCNWxOzZsL8FAcJPrMw75h9X77O+hHvjQEGXtadYwPCNExFsUfzp3CpnOE5lnD8sw==">()
                     );
                  }

                  if (!this.iIIIiIlIlIIiIl.Iilililiiili()) {
                     var13 ^= (0L ^ var13) & -1L << 32;

                     while (!this.IIililIili(var2) && !this.iIIIiIlIlIIiIl.Iilililiiili()) {
                        int var18 = (int)(var13 >>> 32);
                        var13 += 4294967296L;
                        if (var18 >= 4096) {
                           break;
                        }

                        this.iIIIiIlIlIIiIl.IIiilIiiiIii();
                     }
                  }

                  if (this.IIIiiIllIIiiIl == 0
                     && !this.iIIIiIlIlIIiIl.Iilililiiili()
                     && var1.method_31478() > this.iIIIiIlIlIIiIl.Ililllililil().method_10264()) {
                     var13 ^= (0L ^ var13) & -1L << 32;

                     while (!this.iIIIiIlIlIIiIl.Iilililiiili() && !this.iIlIiIllIi(var2)) {
                        int var19 = (int)(var13 >>> 32);
                        var13 += 4294967296L;
                        if (var19 >= 4096) {
                           break;
                        }

                        this.iIIIiIlIlIIiIl.IIiilIiiiIii();
                     }

                     if (!this.iIIIiIlIlIIiIl.Iilililiiili() && !this.lllIiillIi(var2)) {
                        this.IlIIIllllIIIll = 0;
                        this.ilIIiIiIIi(var1);
                        this.llliiillii(
                           iiIIIlIIlIIl<"iiIIIlIIlIIl","ey23AOgJo4dQWkiZwvL0VAgg8U2xzufIhFmppsodf+vTUnN6kg3OagB2xG5ri2FGmw==">()
                              + (this.iIIIiIlIlIIiIl.iiIIlIIlIl() + 1)
                              + iiIIIlIIlIIl<"iiIIIlIIlIIl","lRAeGoLjo1nIdWV+MWnwo8iJiKUSSKcHbtdOoyPpDht+kJ6FXweGeHjoPFihRcVto1UflhZJvPrNgzonuZPf/NUGRHXZt0HywQdNLSU6bWTaYLO9jExCwnS2MGl/">()
                        );
                     }
                  }

                  this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","7DIuwuj7b4xqcDohSsRKRUISEmhJG7ZB0E8H8yBjI6KPCsAqXu3RpQxIOEnLaHpx4gC8K9e9/vXl4W/DyffrFTlbvWjAMdtVwVO/">();
               }
            }
         } else {
            this.lilIliilIl();
         }
      }
   }

   private void iiiliIIIii(class_2338 center) {
      long var7 = -2608017166200562478L;
      long var9 = 8431017394425152396L;
      class_638 var2 = this.lllilIlillilIl.field_1687;
      if (var2 != null) {
         var7 ^= (-4294967296L ^ var7) & -1L << 32;

         while ((int)(var7 >>> 32) <= 1) {
            for (var7 ^= ~var7 & -1L >>> 32; (int)var7 <= 1; var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32) {
               for (var9 ^= (-4294967296L ^ var9) & -1L << 32; (int)(var9 >>> 32) <= 1; var9 += 4294967296L) {
                  class_2338 var6 = center.method_10069((int)(var7 >>> 32), (int)var7, (int)(var9 >>> 32));
                  if (var2.method_8320(var6).method_26215()) {
                     this.iIlliIlIllliIl.add(var6);
                  }
               }
            }

            var7 += 4294967296L;
         }
      }
   }

   private static int lIliliIlil(class_1661 inv, class_1792 item) {
      long var3 = 7131060371897754105L;

      for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < 9; var5 += 4294967296L) {
         if (inv.method_5438((int)(var5 >>> 32)).method_7909() == item) {
            return (int)(var5 >>> 32);
         }
      }

      return -1;
   }

   public String Iilililiiili() {
      long var16 = -9170085705771210285L;
      long var18 = 7121594018869135734L;
      long var20 = 3239681962184223797L;
      long var22 = -6150756465031074593L;
      long var24 = -8573441207346899646L;
      long var26 = -3507711788648439587L;
      class_638 var1 = this.lllilIlillilIl.field_1687;
      if (var1 != null && this.iililIlIIiilIl.IIIllIIliIIl()) {
         var16 ^= (0L ^ var16) & -1L << 32;
         var16 ^= (0L ^ var16) & -1L >>> 32;
         var18 ^= (0L ^ var18) & -1L << 32;
         var18 ^= (0L ^ var18) & -1L >>> 32;
         var20 ^= (0L ^ var20) & -1L << 32;
         var20 ^= (0L ^ var20) & -1L >>> 32;
         var22 ^= (0L ^ var22) & -1L << 32;
         class_2339 var9 = new class_2339();

         for (var22 ^= ((long)(this.iililIlIIiilIl.IlIlllIlilIl() - 1) ^ var22) & -1L >>> 32;
            (int)var22 <= this.iililIlIIiilIl.Illlllllilll() + 1;
            var22 ^= (var22 ^ var22 + (long)1) & -1L >>> 32
         ) {
            var24 ^= ((long)(this.iililIlIIiilIl.IiIlliIliiIl() - 1) << 32 ^ var24) & -1L << 32;

            while ((int)(var24 >>> 32) <= this.iililIlIIiilIl.Iilllilliill() + 1) {
               for (var24 ^= ((long)(this.iililIlIIiilIl.IIlllIlliIll() - 1) ^ var24) & -1L >>> 32;
                  (int)var24 <= this.iililIlIIiilIl.IIillIiliIil() + 1;
                  var24 ^= (var24 ^ var24 + (long)1) & -1L >>> 32
               ) {
                  var9.method_10103((int)var22, (int)(var24 >>> 32), (int)var24);
                  class_3610 var13 = var1.method_8316(var9);
                  var26 ^= ((long)liilIlIiiiilIlIi.IliIlllilIi(var13) << 32 ^ var26) & -1L << 32;
                  if ((int)(var26 >>> 32) == 0 && !liilIlIiiiilIlIi.liiiIIllIl(var13)) {
                     if (this.iililIlIIiilIl.IlIillIiilIi(var9) && this.IIliilIlii(var1, var9)) {
                        var22 += 4294967296L;
                     }
                  } else {
                     var26 ^= ((long)(var13.method_15771() && liilIlIiiiilIlIi.iliIiiliiiii(var1, var9, var13) ? 1 : 0) ^ var26) & -1L >>> 32;
                     if ((int)(var26 >>> 32) != 0) {
                        if (var13.method_15771()) {
                           var16 += 4294967296L;
                        } else {
                           var16 ^= (var16 ^ var16 + (long)1) & -1L >>> 32;
                        }

                        if ((int)var26 != 0) {
                           var20 += 4294967296L;
                        }
                     } else {
                        if (var13.method_15771()) {
                           var18 += 4294967296L;
                        } else {
                           var18 ^= (var18 ^ var18 + (long)1) & -1L >>> 32;
                        }

                        if ((int)var26 != 0) {
                           var20 ^= (var20 ^ var20 + (long)1) & -1L >>> 32;
                        }
                     }
                  }
               }

               var24 += 4294967296L;
            }
         }

         return iiIIIlIIlIIl<"iiIIIlIIlIIl","gCjz+w0FfFk+uusx285y1LyqRUkmTPopjXmx1zGaM21Y7NZm">()
            + (int)(var16 >>> 32)
            + iiIIIlIIlIIl<"iiIIIlIIlIIl","7zpt02lysKcfy/4Ywiv2Mk4U9rHjqBmQSNnn2rhBVJYsyXkZT0Q=">()
            + (int)var16
            + iiIIIlIIlIIl<"iiIIIlIIlIIl","BFCP69ltNsTWpQHik9a0ujH/qr711MKDyCw18JfFLW8nG4dkRyevdxw=">()
            + (int)(var20 >>> 32)
            + iiIIIlIIlIIl<"iiIIIlIIlIIl","y1jSfI/5jI9o782Hf75cioa7wVFfNKet9WXpwEogXES4PJ5Y74s=">()
            + (int)(var18 >>> 32)
            + iiIIIlIIlIIl<"iiIIIlIIlIIl","WrVuCaucqoUh+MhDvYP1LcnVFR8ffLOUM7KnxAWK+9+IskrjXsOY">()
            + (int)var18
            + iiIIIlIIlIIl<"iiIIIlIIlIIl","raPlOKseBut9LYnqGU9nNi1in1BMhbSrTCQFp/miWyxWnJh1Eoz54ulS">()
            + (int)var20
            + iiIIIlIIlIIl<"iiIIIlIIlIIl","oe1/W7rknE3qS9Z1oX8yDGY3vy05xVcHFfunMZas84kn9voWD1dnt/M=">()
            + (int)(var22 >>> 32)
            + iiIIIlIIlIIl<"iiIIIlIIlIIl","IoMl8z0SXpcxqegsd2y8FyDiT+MY4pvwiP65qVyeK946qM57yolq">()
            + this.Iiiiliiiiiii(var1)
            + iiIIIlIIlIIl<"iiIIIlIIlIIl","JIYW5WkRcy0DyKvd4vW5PA758LQ3vCMfST5PerWstwRBVcy6m1vJ0KE=">()
            + this.lilIiIliilIiIl.size();
      } else {
         return iiIIIlIIlIIl<"iiIIIlIIlIIl","fjauEySi/LvpqRMOuGLi5wo1O6OAPEFY8cFg72HWgps0SkE=">();
      }
   }

   private void lIiIiiIiIi(class_746 p, class_2338 pos) {
      long var26 = -8848295744503933243L;
      long var28 = -7251947304849143577L;
      long var30 = 5682963572424163564L;
      if (this.iIIIiIlIlIIiIl != null && !this.iIIIiIlIlIIiIl.Iilililiiili() && p.method_24828()) {
         class_243 var3 = p.method_33571();
         double var4 = (double)pos.method_10263() + 0.5 - p.method_23317();
         double var6 = (double)pos.method_10260() + 0.5 - p.method_23321();
         double var8 = Math.hypot(var4, var6);
         double var10 = (double)pos.method_10264() + 0.5 - var3.field_1351;
         if (!(Math.abs(var10) > 1.6)) {
            var26 ^= ((long)(pos.method_10264() >= p.method_31478() ? 1 : 0) << 32 ^ var26) & -1L << 32;
            if ((int)(var26 >>> 32) != 0 || !(var8 < 1.1)) {
               class_638 var13 = this.lllilIlillilIl.field_1687;
               if (var13 != null) {
                  var26 ^= ((long)(var4 > 0.2 ? 1 : (var4 < -0.2 ? -1 : 0)) ^ var26) & -1L >>> 32;
                  var28 ^= ((long)(var6 > 0.2 ? 1 : (var6 < -0.2 ? -1 : 0)) << 32 ^ var28) & -1L << 32;
                  class_2338 var16 = p.method_24515();
                  if ((int)var26 != 0 && !lllIIlilillIIlil.iliIiiliiiii(var13, var16.method_10069((int)var26, -1, 0))
                     || (int)(var28 >>> 32) != 0 && !lllIIlilillIIlil.iliIiiliiiii(var13, var16.method_10069(0, -1, (int)(var28 >>> 32)))
                     || (int)var26 != 0
                        && (int)(var28 >>> 32) != 0
                        && !lllIIlilillIIlil.iliIiiliiiii(var13, var16.method_10069((int)var26, -1, (int)(var28 >>> 32)))) {
                     return;
                  }
               }

               double var14 = Math.toRadians((double)p.method_36454());
               double var32 = Math.sin(var14);
               double var18 = Math.cos(var14);
               double var20 = var6 * var18 - var4 * var32;
               double var22 = var6 * var32 + var4 * var18;
               var28 ^= ((long)(Math.abs(var22) > Math.abs(var20) ? 1 : 0) ^ var28) & -1L >>> 32;
               var30 ^= ((long)(this.IililIllililIl.illiIIiliIiliIIili && var8 > 2.2 ? 1 : 0) << 32 ^ var30) & -1L << 32;
               this.lIiilIliIiilIl.IliIlllilIi(liiIiiiiIi(var20), (int)var28 != 0 ? liiIiiiiIi(var22) : 0.0F, false, (boolean)((int)(var30 >>> 32)));
            }
         }
      }
   }

   private boolean IIIlilIIli(class_1937 pos, class_746 p, class_2338 w, double reach) {
      class_3965 var6 = pos.method_17742(new class_3959(p.method_33571(), class_243.method_24953(w), class_3960.field_17559, class_242.field_1348, p));
      if (var6.method_17783() == class_240.field_1332 && !var6.method_17777().equals(w)) {
         class_2338 var7 = var6.method_17777();
         if (this.iililIlIIiilIl.IlIillIiilIi(var7)
            && lllIIlilillIIlil.IilliliilIIi(pos, var7)
            && this.IliilIllliilIl.IIlllIlliIll(var7, reach)
            && !this.ilIiiIiIii(var7)
            && !this.IIlilIliiIli(pos, var7)
            && !this.lIllIlliIllIll.containsKey(var7)) {
            this.lIiilIliIiilIl.iIlIlllllill();
            this.Ilillllill(var7, reach, true);
            this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","z41nN3ziWlYPxXRUocLpXjF3Bq1mBpE32yvZ8rvI/+EOk80TqazUhkCyK8p1ZCeQKzMhwYzocfNdtepDV1q8quVYlHuV3g==">();
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean Iiiilliiil(class_746 p, class_2338 pos) {
      return p.method_31478() == this.iIIIiIlIlIIiIl.iIlIlllllill() || IlIIillIIi(p, pos, 30.0);
   }

   private void IiIilliIil(class_746 p) {
      if (this.IIiIllllIiIlll >= 0) {
         this.lliIllliliIlll = this.IIiIllllIiIlll;
         this.IiiIlllliiIlll = this.iIiIlllIliIlll;
         this.iiiIlllIIIllll = p;
         this.IIiIllllIiIlll = -1;
         this.iIiIlllIliIlll = null;
         this.iiIilIIlil();
      }
   }

   void IlIillIiilIi(class_2338 pos, boolean replacedSource) {
      this.illIiIlIilIiIl.add(pos);
      this.lilIiIliilIiIl.add(pos);
      if (replacedSource) {
         this.IIiIiIllIiIiIl.add(pos);
      } else {
         this.IIiIiIllIiIiIl.remove(pos);
      }

      this.IIIIiIllIIIiIl.liiiIIllIl().IilliliilIIi(pos);
   }

   private void iIiIlIliIl(int leftover) {
      long var4 = 5261966667258089409L;
      if (!this.IiIlIllliIlIll.isEmpty()) {
         leftover = Math.max(leftover, 0) + this.IiIlIllliIlIll.size();
      }

      this.IiiIiIlliiIiIl = false;
      this.iiiIiIlIIIliIl = false;
      this.lIIliIliIIliIl.clear();
      String var2;
      if (leftover > 0) {
         var2 = iiIIIlIIlIIl<"iiIIIlIIlIIl","GE9917DYwk6+1hmQO+NeJHDNptmVsWg7lY7Nqfw/FcDxK7KP">()
            + leftover
            + iiIIIlIIlIIl<"iiIIIlIIlIIl","Ns4pvV9xyH7qf5bPXLs++uCHkLjBv8S4B6parm/vVQCqUA==">()
            + (leftover == 1 ? "" : iiIIIlIIlIIl<"iiIIIlIIlIIl","2fEfodXdr0S71BGyf2zQzW/mBn88Z6JKuyHlplc=">())
            + iiIIIlIIlIIl<"iiIIIlIIlIIl","FY1qEWn/E0nXHTSZxxE7suwC9TN6q1hogYjvXCJyIdmylVFD+KSRNuniBumvNm8gIbKRO3DocEQMH1gfRE7S5gioZRSLv6oEgjSu7S+DeVOgR+mEJduE0ffV8f8=">();
      } else if (leftover == 0) {
         var2 = iiIIIlIIlIIl<"iiIIIlIIlIIl","BaCD5PwpU+nfPzTl+DtdUNfknHC402cuyE002AHIdNqv+ExBuI0N6QHtW2xNQqqp9Gs=">();
      } else {
         var2 = "";
      }

      var4 ^= ((long)(this.lllilIlillilIl.field_1687 == null ? 0 : this.Iiiiliiiiiii(this.lllilIlillilIl.field_1687)) << 32 ^ var4) & -1L << 32;
      if ((int)(var4 >>> 32) > 0) {
         var2 = var2
            + iiIIIlIIlIIl<"iiIIIlIIlIIl","GE9917DYwk6+1hmQO+NeJHDNptmVsWg7lY7Nqfw/FcDxK7KP">()
            + (int)(var4 >>> 32)
            + iiIIIlIIlIIl<"iiIIIlIIlIIl","8iF2UCaJ2pqkJhBmuVnI6YVhzuKTQAFQrEjGvrVr+BC76CA3wI4w">()
            + (
               (int)(var4 >>> 32) == 1
                  ? iiIIIlIIlIIl<"iiIIIlIIlIIl","Gh4Fug6Zk1qN3V3Y7OEytaeCIMrU7W526DNg9mVS6sY=">()
                  : iiIIIlIIlIIl<"iiIIIlIIlIIl","+u6mPkRw44wg0Vzg6b8R3oiHaLHzXOjbPoJLJAP2VmGepw==">()
            )
            + iiIIIlIIlIIl<"iiIIIlIIlIIl","cKeqnEl098gKPIrZ2eiGpr8wv825luqKKZuf2nKkVk3BwXnGqIYdHZO8pI0ApohbhnJJP61xOvHp92W0ngjrgAr2AYqz">();
      }

      this.llliiillii(
         iiIIIlIIlIIl<"iiIIIlIIlIIl","rzzog20Ez4BUT69yZJ3SDU91KoW9y8+dvdLk9U1zN1zGnBSqfYRhqg==">()
            + this.lllliIlillliIl
            + iiIIIlIIlIIl<"iiIIIlIIlIIl","gtQcTPFe9ERcNFmbQLJLIcZDwsz1H7YvYxfK3yg5NexyL2A=">()
            + var2
            + iiIIIlIIlIIl<"iiIIIlIIlIIl","qGaw/mcpRHPBK9AAUg6qQRKtMyB7a16jor9Zpu4=">()
      );
      this.IIiIllIiIl();
      this.IliilIllliilIl.Iilililiiili();
      this.lIlIiIliIlIiIl = null;
      this.llIIiIlilIIiIl = lilIIliiilIIli.IIiIliiiilIiIliiii;
   }

   private boolean IIliilIlii(class_1937 pos, class_2338 w) {
      return this.iililIlIIiilIl.IlIillIiilIi(w) && this.lIIiiiIIii(w) && !pos.method_8320(w).method_26215() && !this.IIlilIliiIli(pos, w)
         ? lllIIlilillIIlil.IilliliilIIi(pos, w)
         : false;
   }

   private boolean IIiilIiiiIii(class_746 p, class_2338 dest) {
      double var3 = p.method_5707(class_243.method_24955(dest));
      if (dest.equals(this.IIliIlllIliIll) && !(var3 < this.iIliIllIlliIll - 1.0)) {
         return ++this.llliIllilliIll > 200;
      } else {
         this.IIliIlllIliIll = dest.method_10062();
         this.iIliIllIlliIll = var3;
         this.llliIllilliIll = 0;
         return false;
      }
   }

   private class_2338 iIiliIlili(class_1937 w) {
      class_2338 var2 = this.iIIIiIlIlIIiIl.Ililllililil();
      return this.IlIiillIii(w, var2) && !this.lIllIlliIllIll.containsKey(var2) ? var2 : null;
   }

   public iIiiiIIlIliiiIIl IilliliilIIi() {
      return this.iIIIiIlIlIIiIl;
   }

   private void lililiilil(llliIiIiilliIiIi t) {
      if (this.lIiliIliIiliIl != t) {
         this.lIiliIliIiliIl = t;
         this.ililiIlIiiliIl = 0;
      }
   }

   private int Iiiiliiiiiii(class_1937 w) {
      long var5 = -1160626224440888185L;
      var5 ^= (0L ^ var5) & -1L << 32;

      for (class_2338 var4 : this.lilIiIliilIiIl) {
         if (this.iililIlIIiilIl.IlIillIiilIi(var4) && this.IIlilIliiIli(w, var4)) {
            var5 += 4294967296L;
         }
      }

      return (int)(var5 >>> 32);
   }

   public String IIillIiliIil() {
      return switch (this.llIIiIlilIIiIl) {
         case IIiIliiiilIiIliiii -> iiIIIlIIlIIl<"iiIIIlIIlIIl","ISY8Q4zAcGwvUnQ9k9K1WZBmyFRbVIytFCxAyMGOW79eJK9Jxe0K">();
         case lilIliiiiiilIliiii -> this.iIIIiIlIlIIiIl.lilIliilIl()
         + iiIIIlIIlIIl<"iiIIIlIIlIIl","4a5a8uuB0fEuA2O5RGzFNHB5jypnK/xMsjXEfMMcnDk=">()
         + Math.round(this.iIIIiIlIlIIiIl.illIlIilIl() * 100.0F)
         + iiIIIlIIlIIl<"iiIIIlIIlIIl","2q3ZGhe5JwF9/KuwHXiw/HDSpl1DoZEZj0fC4Q8JJwyRSXrhugDc">()
         + this.lllliIlillliIl
         + (this.IilliIllilliIl > 0 ? iiIIIlIIlIIl<"iiIIIlIIlIIl","lNRm583d/uwoTk4Z4C4KS4dr9yOTdMLci6PGwl15650ZiEsPV+SXFA==">() + this.IilliIllilliIl : "")
         + (this.iiliIllIIiiIll.isEmpty() ? "" : iiIIIlIIlIIl<"iiIIIlIIlIIl","4a5a8uuB0fEuA2O5RGzFNHB5jypnK/xMsjXEfMMcnDk=">() + this.iiliIllIIiiIll);
         case illIliiiiIilIliiii -> iiIIIlIIlIIl<"iiIIIlIIlIIl","5c2l8Khw0YlbWTytItXt6ZnwOSHnsoAIq42SVHZmgG3H1RMIFVU=">()
         + (this.iIIIiIlIlIIiIl != null ? this.iIIIiIlIlIIiIl.lilIliilIl() : "");
         case IllIliiiilllIliiii -> iiIIIlIIlIIl<"iiIIIlIIlIIl","lDfKMZ6YIlNIdCCULbZhJAk5IrxDGgNxAkCVbeBALrUSOVeV4zI5wLNy">()
         + this.lllliIlillliIl
         + iiIIIlIIlIIl<"iiIIIlIIlIIl","gtQcTPFe9ERcNFmbQLJLIcZDwsz1H7YvYxfK3yg5NexyL2A=">();
      };
   }

   public void iIlIlllllill() {
      if (!this.liiiIIllIl()) {
         this.iIIIiIlIlIIiIl = null;
         this.llIIiIlilIIiIl = lilIIliiilIIli.IllIliiiilllIliiii;
      }
   }

   private boolean IilIililIi() {
      this.ilIIIllIiIIIll = false;
      this.IIlIIlllIlIIll = null;
      this.lIIIIlliIIIIll = null;
      this.lllIIllillIIll = null;
      this.iIlIIllIllIIll = 0;
      this.iilIIllIIiIIll = 0;
      this.lIiIIlliIiIIll = 0;
      this.IliIIlllliIIll = 0;
      this.iliIIllIiiIIll = false;
      return false;
   }

   private boolean ilIllIiIll(class_746 w, class_1937 p, int finalMode, int lo, boolean hi) {
      double var6 = Math.max(this.IililIllililIl.iIiiIIiliIliiIIili, w.method_55754());
      if (this.lIiiIlliIiiIll != null
         && (
            !this.liIiiiiIii(p, this.lIiiIlliIiiIll)
               || !this.iililIlIIiilIl.IlIillIiilIi(this.lIiiIlliIiiIll)
               || !this.IliilIllliilIl.IIlllIlliIll(this.lIiiIlliIiiIll, var6)
         )) {
         this.lIiiIlliIiiIll = null;
         this.liiiIlliiiiIll = 0;
      }

      if (this.lIiiIlliIiiIll == null && !this.IIIIiIllIIIiIl.lIiiIiIlilli()) {
         this.lIiiIlliIiiIll = this.iilllIIill(p, w, var6, finalMode, lo, hi);
         if (this.lIiiIlliIiiIll != null) {
            this.liiiIlliiiiIll = 0;
         }
      }

      if (this.lIiiIlliIiiIll != null) {
         if (++this.liiiIlliiiiIll > 70) {
            this.lIllIlliIllIll.put(this.lIiiIlliIiiIll.method_10062(), 1200);
            this.lIiiIlliIiiIll = null;
            this.liiiIlliiiiIll = 0;
            this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","rAuNUdpKYFJ/qrNAskdV399QXrLnHwsGq6IfHtPDOeekuLvloam47pXo8SOivC2ebEjK6Iw=">();
            return true;
         } else {
            this.lIiilIliIiilIl.iIlIlllllill();
            this.Ilillllill(this.lIiiIlliIiiIll, var6, false);
            if (this.IliilIllliilIl.IiIlliIliiIl() && !this.lliIiIliliIiIl) {
               this.lliIiIliliIiIl = true;
               this.llliiillii(
                  iiIIIlIIlIIl<"iiIIIlIIlIIl","MBGH1rJNtByA4WLr8G3EMrIGGpauG3Kv5slxCcSJcFdjSmP1fdDq3E7yjx7G53R6G/LzrLHBiCOefBOcFj5UQ/7uDNYyAofiLdEVJIwhgWGkC1q+UrJHuAYR51FrawBLDx5Qn5C3fOXZuW4Y/u1u8McmEVmogIbcuYENcPVpmYHHtMGiueYaR0pNOfXr8MTL7e+SZWKTsybbNGeVQdFCWmCNwbpSKFaX5nNAUdH3aJamb05YgxU=">()
               );
            }

            this.iiliIllIIiiIll = hi
               ? iiIIIlIIlIIl<"iiIIIlIIlIIl","vqnekt6diyTuIjroD+DZYbXvBJUZfL18ESLTorYWGxCK16yD8MSkoo7hhkfLz1vB86B06tquEYhcKM3tNA==">()
               : iiIIIlIIlIIl<"iiIIIlIIlIIl","H9QW5uRUlTcOJQ/1sRT1ul0VijfAY6LSTmKSTxlEae1PMqo9/7LZXR67NlfprgcaYsKpnptOWzj5">();
            return true;
         }
      } else {
         class_2338 var8 = hi ? this.lllllillll(w) : this.lIilliIill(p, w);
         if (var8 == null) {
            this.IliiIlllliiIll = null;
            this.iliiIllIiiiIll = null;
            return false;
         } else {
            if (this.IliiIlllliiIll == null || !var8.equals(this.iliiIllIiiiIll)) {
               this.iliiIllIiiiIll = var8;
               this.IliiIlllliiIll = this.Iillllilll(p, w, var8);
            }

            if (this.IliiIlllliiIll == null) {
               this.lIllIlliIllIll.put(var8.method_10062(), 2400);
               this.iliiIllIiiiIll = null;
               return true;
            } else {
               this.iiliIllIIiiIll = hi
                  ? iiIIIlIIlIIl<"iiIIIlIIlIIl","fBnrdm9BboL6jmlMfmJaS9K16yuzpSN4N/UU9iOjsGiR//5EbgVciAb3ATtUit0xjzoL8Q6hJfUVs1t/iO9aBqASQtFUHgY=">()
                  : iiIIIlIIlIIl<"iiIIIlIIlIIl","v4EWpa/K9LmAsKi+ls+ene/4cSGo8tK8LfpQptv2eB98KTEEXK97d6PmkHmuAAn6GQzRI5UFYB+/nTaTEHsPCnjPc+tjPWB0mUt1Xh+K">();
               lillilliillill var9 = this.IIIIiIllIIIiIl.IIlilIliiIli(this.IliiIlllliiIll);
               if (var9 == lillilliillill.IIlilIlIilIlilIlIi) {
                  this.lIllIlliIllIll.put(var8.method_10062(), 1200);
                  this.iIilIllIlilIll.add(this.IliiIlllliiIll);
                  this.IliiIlllliiIll = null;
                  this.iliiIllIiiiIll = null;
               } else if (var9 == lillilliillill.liIilIlIiiiIilIlIi) {
                  this.lIiilIliIiilIl.iIlIlllllill();
                  this.iIilIllIlilIll.add(this.IliiIlllliiIll);
                  this.IliiIlllliiIll = null;
                  this.iliiIllIiiiIll = null;
               }

               return true;
            }
         }
      }
   }

   private class_2338 iilllIIill(class_1937 finalMode, class_746 p, double w, int lo, int hi, boolean reach) {
      long var33 = 7807703182704436080L;
      long var35 = -7182107098380831120L;
      long var37 = -8185037606079230061L;
      long var39 = -2975792068247069168L;
      long var41 = 5962395734754265915L;
      long var43 = -4407114557622940842L;
      long var31 = -5278134527958266021L;
      class_2338 var8 = p.method_24515();
      class_243 var9 = p.method_33571();
      var31 ^= ((long)(reach ? Integer.MIN_VALUE : this.iIIIiIlIlIIiIl.Ililllililil().method_10264()) << 32 ^ var31) & -1L << 32;
      var31 ^= ((long)((int)Math.sqrt(100.0) + 1) ^ var31) & -1L >>> 32;
      var33 ^= ((long)(this.iIIIiIlIlIIiIl.lIIlllilIl == class_2351.field_11048 ? 1 : 0) << 32 ^ var33) & -1L << 32;
      var33 ^= ((long)((int)(var33 >>> 32) != 0 ? var8.method_10263() : var8.method_10260()) ^ var33) & -1L >>> 32;
      var35 ^= ((long)((int)(var33 >>> 32) != 0 ? var8.method_10260() : var8.method_10263()) << 32 ^ var35) & -1L << 32;
      var35 ^= ((long)Math.max(this.iIIIiIlIlIIiIl.IIIIllIIIl(), (int)var33 - (int)var31) ^ var35) & -1L >>> 32;
      var37 ^= ((long)Math.min(this.iIIIiIlIlIIiIl.iIIIlIlIIl(), (int)var33 + (int)var31) << 32 ^ var37) & -1L << 32;
      var37 ^= ((long)Math.max(this.iIIIiIlIlIIiIl.llIIlilIIl(), (int)(var35 >>> 32) - (int)var31) ^ var37) & -1L >>> 32;
      var39 ^= ((long)Math.min(this.iIIIiIlIlIIiIl.IiIIlliIIl(), (int)(var35 >>> 32) + (int)var31) << 32 ^ var39) & -1L << 32;
      class_2338 var19 = null;
      var39 ^= ~var39 & -1L >>> 32;
      double var21 = Double.MAX_VALUE;
      var41 ^= ((long)hi << 32 ^ var41) & -1L << 32;

      while ((int)(var41 >>> 32) >= lo) {
         for (var41 ^= ((long)((int)var35) ^ var41) & -1L >>> 32; (int)var41 <= (int)(var37 >>> 32); var41 ^= (var41 ^ var41 + (long)1) & -1L >>> 32) {
            for (var43 ^= ((long)((int)var37) << 32 ^ var43) & -1L << 32; (int)(var43 >>> 32) <= (int)(var39 >>> 32); var43 += 4294967296L) {
               class_2338 var26 = this.iIIIiIlIlIIiIl.IIlilIliiIli((int)var41, (int)(var43 >>> 32), (int)(var41 >>> 32));
               if (this.iililIlIIiilIl.IlIillIiilIi(var26)) {
                  double var27 = var26.method_10262(var8);
                  if (!(var27 > 100.0)
                     && this.liIiiiiIii(finalMode, var26)
                     && !this.lIllIlliIllIll.containsKey(var26)
                     && !this.IlllIllllllIll.containsKey(var26)
                     && this.IliilIllliilIl.IIlllIlliIll(var26, w)) {
                     class_3965 var29 = finalMode.method_17742(
                        new class_3959(var9, class_243.method_24953(var26), class_3960.field_17559, class_242.field_1348, p)
                     );
                     if (var29.method_17783() != class_240.field_1332 || var29.method_17777().equals(var26)) {
                        var43 ^= ((long)(this.IIIillIIil(finalMode, var26) + ((int)(var41 >>> 32) == (int)(var31 >>> 32) ? 100 : 0)) ^ var43) & -1L >>> 32;
                        if ((int)var43 > (int)var39 || (int)var43 == (int)var39 && var27 < var21) {
                           var39 ^= ((long)((int)var43) ^ var39) & -1L >>> 32;
                           var21 = var27;
                           var19 = var26.method_10062();
                        }
                     }
                  }
               }
            }
         }

         var41 += -4294967296L;
      }

      return var19;
   }

   private void iIlllIllll(class_746 p, class_1937 w) {
      long var5 = 3219217106669119451L;
      if (!this.iiiIiIlIIIliIl) {
         this.lIIliIliIIliIl.removeIf(c -> !this.IIliilIlii(w, c));
         if (!this.ilIllIiIll(p, w, this.iililIlIIiilIl.IiIlliIliiIl(), this.iililIlIIiilIl.Iilllilliill(), true)) {
            if (!this.lIIliIliIIliIl.isEmpty() && !this.IlllIllllllIll.isEmpty()) {
               this.lIiilIliIiilIl.iIlIlllllill();
               this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","R5RLMGgT1H66173GnqwepB2RtvK+mV1UobuUZNDGjZAP341Fn2OEXW5RJufjgeY/7w3pRLy5/85BpNcOPBNMJVcfn5ueI588a9kHZeOEQ0w5">();
            } else if (!this.lIIliIliIIliIl.isEmpty() && this.IIlliIllIlliIl < 2) {
               this.IIlliIllIlliIl++;
               this.lIllIlliIllIll.clear();
               this.iIilIllIlilIll.clear();
               this.llliiillii(
                  iiIIIlIIlIIl<"iiIIIlIIlIIl","5up1eeUywUKv4uy4Ekvyc4QdW3zLAu+VyNShaS1WI8D75Atx//gghqY=">()
                     + this.lIIliIliIIliIl.size()
                     + iiIIIlIIlIIl<"iiIIIlIIlIIl","tdUTeYW58UTMeKwHCcuIWkwoen2ZZq7QyKnhY7SrM2x8Hsl4nd8iTaG5">()
                     + (this.lIIliIliIIliIl.size() == 1 ? "" : iiIIIlIIlIIl<"iiIIIlIIlIIl","2fEfodXdr0S71BGyf2zQzW/mBn88Z6JKuyHlplc=">())
                     + iiIIIlIIlIIl<"iiIIIlIIlIIl","OjE5J/WqDG4hx7mImHbPaMUjULyPWRZ40Rd25W9teMJLaAJLYRDPIl6LskZU8ZU=">()
                     + this.IIlliIllIlliIl
                     + iiIIIlIIlIIl<"iiIIIlIIlIIl","dmq/JJPmY7O6mww+I/rNWJmBAKNeIP8SC1aCRA8=">()
                     + 2
                     + iiIIIlIIlIIl<"iiIIIlIIlIIl","FS8x+FRiaAgjmBWaGWVc/oseF/3kiOR6gzr35aY=">()
               );
            } else {
               this.iIiIlIliIl(this.lIIliIliIIliIl.size());
            }
         }
      } else {
         this.lIiilIliIiilIl.iIlIlllllill();
         var5 ^= (257698037760000L ^ var5) & -1L << 32;

         while (true) {
            int var10000 = (int)(var5 >>> 32);
            var5 += -4294967296L;
            if (var10000 <= 0 || this.ilIliIlIiIliIl < this.iililIlIIiilIl.IiIlliIliiIl()) {
               if (this.ilIliIlIiIliIl >= this.iililIlIIiilIl.IiIlliIliiIl()) {
                  return;
               } else {
                  this.iiiIiIlIIIliIl = false;
                  if (this.lIIliIliIIliIl.isEmpty()) {
                     this.iIiIlIliIl(0);
                     return;
                  } else {
                     this.llliiillii(
                        iiIIIlIIlIIl<"iiIIIlIIlIIl","5up1eeUywUKv4uy4Ekvyc4QdW3zLAu+VyNShaS1WI8D75Atx//gghqY=">()
                           + this.lIIliIliIIliIl.size()
                           + iiIIIlIIlIIl<"iiIIIlIIlIIl","Ns4pvV9xyH7qf5bPXLs++uCHkLjBv8S4B6parm/vVQCqUA==">()
                           + (this.lIIliIliIIliIl.size() == 1 ? "" : iiIIIlIIlIIl<"iiIIIlIIlIIl","2fEfodXdr0S71BGyf2zQzW/mBn88Z6JKuyHlplc=">())
                           + iiIIIlIIlIIl<"iiIIIlIIlIIl","dfmE7hTkUo/+gx9noOeoeLiQ5nN3bsfczrOUYUII8fy+4yptsBEBwTeFYNWyb+1r/QG0l3E9VqQT2ysbALZkqwtsqg==">()
                     );
                     return;
                  }
               }
            }

            class_2338 var4 = new class_2338(this.IlIliIlllIliIl, this.ilIliIlIiIliIl, this.liIliIliiIliIl);
            if (this.IIliilIlii(w, var4)) {
               this.lIIliIliIIliIl.add(var4);
            }

            if (++this.liIliIliiIliIl > this.iililIlIIiilIl.IIillIiliIil()) {
               this.liIliIliiIliIl = this.iililIlIIiilIl.IIlllIlliIll();
               if (++this.IlIliIlllIliIl > this.iililIlIIiilIl.Illlllllilll()) {
                  this.IlIliIlllIliIl = this.iililIlIIiilIl.IlIlllIlilIl();
                  this.ilIliIlIiIliIl--;
               }
            }
         }
      }
   }

   private boolean liIIiiiIIi(class_1937 w, class_746 p) {
      long var16 = -5024013592475415819L;
      if (this.lIIIIlliIIIIll != null) {
         if (this.iIlIIllIllIIll > 600) {
            if (++this.IlIIIllllIIIll <= 2) {
               this.ilIIiIiIIi(p);
               this.llliiillii(
                  iiIIIlIIlIIl<"iiIIIlIIlIIl","09tnYGGsYbW3ADNJvp8GRXmm+mbr+QsauYcPnxCGKO0RhrSvvJM81surXvihS6a8229SfklB1Nk7o4Gm3VLEWwz+4zoHLN42PCJcl6ztKsVmGEfjUBq2MTXjvdWbRoYVlW57h3d6rsPUDrm2hC8LKZw2H4WNnQ==">()
                     + this.IlIIIllllIIIll
                     + iiIIIlIIlIIl<"iiIIIlIIlIIl","eyEzLZ7OkyGR1AavTG+KVHIMQVWCFC1zNiwPeHOCQg==">()
               );
               return true;
            } else {
               this.lIIIIlliIIIIll = null;
               this.llliiillii(
                  iiIIIlIIlIIl<"iiIIIlIIlIIl","4DHEm0RG5kFWBcxETrznxb+JFs0ruc8/nxUoiyCK269QJ+uO2D8sdq70AdvCBunoGP+4FFaJVNqvYMRMmEKIQ7Gpmv5/f7qFbsv84WCZDyx0n1FxLzW4Qh0PPqox4RBPEwzw7Sz4r47we7qK">()
               );
               return false;
            }
         } else {
            lillilliillill var3 = this.IIIIiIllIIIiIl.IIlilIliiIli(this.lIIIIlliIIIIll);
            if (var3 == lillilliillill.liIilIlIiiiIilIlIi) {
               this.lIIIIlliIIIIll = null;
               this.ilIIIllIiIIIll = true;
               this.liIIIlliiIIIll = 0;
               this.IIlIIlllIlIIll = null;
               this.iIlIIllIllIIll = 0;
               return true;
            } else if (var3 == lillilliillill.IIlilIlIilIlilIlIi) {
               double var20 = Math.max(this.IililIllililIl.iIiiIIiliIliiIIili, p.method_55754());
               if (this.IIIlilIIli(w, p, this.lIIIIlliIIIIll, var20)) {
                  return true;
               } else if (++this.IlIIIllllIIIll <= 2) {
                  this.ilIIiIiIIi(p);
                  this.llliiillii(
                     iiIIIlIIlIIl<"iiIIIlIIlIIl","X1wYI92V2XBJ+FyyBHeSYdAu6Pe6oTOzYyBKuAWN842pPsvrtFiSTen58uRQHZKg+CI13UsCP3BuLHpA833B1UC+VflwsLi31+NoCRV/yl3VJ57lyn+cvqjMoXo2o+slrTrUt+Vy3Q865I5NIV0pNQ==">()
                        + this.IlIIIllllIIIll
                        + iiIIIlIIlIIl<"iiIIIlIIlIIl","eyEzLZ7OkyGR1AavTG+KVHIMQVWCFC1zNiwPeHOCQg==">()
                  );
                  return true;
               } else {
                  this.lIIIIlliIIIIll = null;
                  this.llliiillii(
                     iiIIIlIIlIIl<"iiIIIlIIlIIl","4DHEm0RG5kFWBcxETrznxb+JFs0ruc8/nxUoiyCK269QJ+uO2D8sdq70AdvCBunoGP+4FFaJVNqvYMRMmEKIQ7Gpmv5/f7qFbsv84WCZDyx0n1FxLzW4Qh0PPqox4RBPEwzw7Sz4r47we7qK">()
                  );
                  return false;
               }
            } else {
               this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","TIpLD15y6wAAtxeG8ShxmoXNKdTvNYhDF7FF+5dKYdD1vCEzYa9NZLZhcPS7Wa81ej5yoquEECoEPZyzmsKVIsC0PdQ+R1fw3vxJ">();
               return true;
            }
         }
      } else if (!this.ilIIIllIiIIIll) {
         return false;
      } else {
         if (this.IIlIIlllIlIIll != null && !this.IlIiillIii(w, this.IIlIIlllIlIIll)) {
            this.liIIIlliiIIIll++;
            this.IIlIIlllIlIIll = null;
            this.iIlIIllIllIIll = 0;
         }

         if (this.lllIIllillIIll == null
            || !p.method_24828()
            || p.method_31477() == this.lllIIllillIIll.method_10263() && p.method_31479() == this.lllIIllillIIll.method_10260()) {
            var16 ^= (
                  (long)(this.liIIIlliiIIIll < 3 && this.IilIIlllilIIll - p.method_31478() < 4 && p.method_31478() > this.iIIIiIlIlIIiIl.iIlIlllllill() ? 0 : 1)
                        << 32
                     ^ var16
               )
               & -1L << 32;
            if ((int)(var16 >>> 32) != 0) {
               if (this.iIlIIllIllIIll > 600) {
                  return this.IilIililIi();
               } else if (!p.method_24828()) {
                  this.lIiilIliIiilIl.iIlIlllllill();
                  this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","+Ta9Tqrb2JhwkMlnjQjK5BqivRa/zc7ZkrqX3Stqd7k319IUSFglP628s4LuZwmcC9BqvTICmqW3MIMbb1bkVpZxfnj+lq9UbmVsCqa7bnLU/m6YozE=">();
                  return true;
               } else if (p.method_31478() < this.iIIIiIlIlIIiIl.iIlIlllllill()) {
                  if (this.IIIIiIllIIIiIl.IiIlliIliiIl(p)) {
                     this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","2oKP21pxOaGoilJFlpVTKHGcezWQenMkJ/RjJTlTlFS7GgEqtnQZBWHgppTyredYVBm0u/ffkSnQDmfOq4jWG/8iWGoKDfTvbaxj6JnXzj002N4SEZo1x7v2">();
                     return true;
                  } else {
                     return this.IilIililIi();
                  }
               } else if (++this.lIiIIlliIiIIll <= 5) {
                  this.lIiilIliIiilIl.iIlIlllllill();
                  this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","8x/iBW1GlaluAxeTlmP3e7FbN/ozHaAt/yLTCy0rLoHWBL0GPXbOENm9A8HxiE/NTQMfu7r/Mgil9K+wCjOB/uB2EDaKx3tH">();
                  return true;
               } else {
                  return this.IilIililIi();
               }
            } else if (this.iIlIIllIllIIll > 600) {
               return this.IilIililIi();
            } else if (!p.method_24828()) {
               this.lIiilIliIiilIl.iIlIlllllill();
               this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","CSSIApGoDZzaeiws3UzpUxXz1nt1Cf0+vGC+Az0W6UlEumiTwCiaIjQ0ZHarzh6SC7X6qCX0p0rOAFzVfGj6C63657WUDg==">()
                  + (this.liIIIlliiIIIll + 1)
                  + iiIIIlIIlIIl<"iiIIIlIIlIIl","tgeqGSiuNvJXpKhi23GFhcbRbbNdqcC1Mu7kh2Ow">();
               return true;
            } else {
               if (this.lllIIllillIIll != null) {
                  double var4 = p.method_23317() - ((double)this.lllIIllillIIll.method_10263() + 0.5);
                  double var6 = p.method_23321() - ((double)this.lllIIllillIIll.method_10260() + 0.5);
                  double var8 = Math.max(Math.abs(var4), Math.abs(var6));
                  if (this.iliIIllIiiIIll && var8 > 0.45) {
                     this.iliIIllIiiIIll = false;
                  }

                  if (!this.iliIIllIiiIIll) {
                     if (var8 <= 0.15) {
                        this.iliIIllIiiIIll = true;
                     } else if (++this.IliIIlllliIIll <= 60) {
                        double var10 = Math.toRadians((double)p.method_36454());
                        double var12 = Math.sin(var10);
                        double var14 = Math.cos(var10);
                        this.lIiilIliIiilIl.IliIlllilIi(iliIiIiiIi(-var6 * var14 - -var4 * var12), iliIiIiiIi(-var6 * var12 + -var4 * var14), false, false);
                        this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","c32JgCocTqzTk0PTKrWkXwoLskrgkdfeUvHycplibgX11CMLCDFIh8wE0BTp2puwILjDYZXjg7hoRRHTZ8eMNynkiI0=">();
                        return true;
                     }
                  }
               }

               if (this.liIIIlliiIIIll == 0 && this.IIlIIlllIlIIll == null) {
                  class_2350 var18 = this.IIlIilIlIi();
                  if (IliIIlIllliIIlIl.liiiIIllIl(p, IliIIlIllliIIlIl.IliIlllilIi((double)var18.method_10148(), (double)var18.method_10165()), 20.0F)) {
                     this.lIiilIliIiilIl.iIlIlllllill();
                     this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","DdtcYaMs3I+PEuRAXjn+QCFF1lNhfPUA8NRVC3yh6kI2JNHWdsginStX/ZUJ+tiCSQn9+0Ll1KsJ7dzD4R2dIt1dDR/ikh0O">();
                     return true;
                  }
               }

               class_2338 var19 = p.method_24515().method_10074();
               double var5 = Math.max(this.IililIllililIl.iIiiIIiliIliiIIili, p.method_55754());
               if (!this.iililIlIIiilIl.IlIillIiilIi(var19)) {
                  return this.IilIililIi();
               } else if (!w.method_8320(var19).method_26215()) {
                  this.iilIIllIIiIIll = 0;
                  if (this.lIllIlliIllIll.containsKey(var19)) {
                     return this.IilIililIi();
                  } else if (this.IIIIiIllIIIiIl.iIlIlllllill().contains(var19)) {
                     return this.IilIililIi();
                  } else if (this.IlIiillIii(w, var19) && this.IliilIllliilIl.IIlllIlliIll(var19, var5)) {
                     this.IIlIIlllIlIIll = var19.method_10062();
                     this.lIiilIliIiilIl.iIlIlllllill();
                     this.Ilillllill(var19, var5, true);
                     this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","opQEEd0ZZ+1YRs1Ay9WPpFvJ3Szj2mfok+K4KEzReVQ9ZNu+SQEVFPlQyPGylWz61VS0c9+3PeRn">()
                        + (this.liIIIlliiIIIll + 1)
                        + iiIIIlIIlIIl<"iiIIIlIIlIIl","tgeqGSiuNvJXpKhi23GFhcbRbbNdqcC1Mu7kh2Ow">();
                     return true;
                  } else {
                     return this.IilIililIi();
                  }
               } else if (++this.iilIIllIIiIIll > 30) {
                  return this.IilIililIi();
               } else {
                  this.lIiilIliIiilIl.iIlIlllllill();
                  this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","xIDpCXyqcexjkoo5pXw2iKiwLEMuY6Czi/L6QeJO2K55Uv84ACcfN4TZ55o4HYOJKkgmzGiCqyRDdOY0WXFgQGAGO2Pipw==">()
                     + (this.liIIIlliiIIIll + 1)
                     + iiIIIlIIlIIl<"iiIIIlIIlIIl","tgeqGSiuNvJXpKhi23GFhcbRbbNdqcC1Mu7kh2Ow">();
                  return true;
               }
            }
         } else {
            var16 ^= ((long)this.iIlIIllIllIIll << 32 ^ var16) & -1L << 32;
            this.ilIIiIiIIi(p);
            this.iIlIIllIllIIll = (int)(var16 >>> 32);
            this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","AzU5jAL4D9RyfcpSOuYo/h0GTpMUuuxe6q3I1AxSkDYCd9ay7E7ZNGz93GR4HrW6VQQck6mn53tuI3knmCUkDSdKsqkGoo8R35nh6LirmOTsKDJeMYk=">();
            return true;
         }
      }
   }

   private boolean lllIiillIi(class_1937 w) {
      long var5 = -1391668625030249821L;
      class_2338 var2 = this.iIIIiIlIlIIiIl.Ililllililil();

      for (long var7 = var5 ^ (0L ^ var5) & -1L << 32; (int)(var7 >>> 32) < 3; var7 += 4294967296L) {
         class_2338 var4 = new class_2338(var2.method_10263(), this.iIIIiIlIlIIiIl.liiiIIllIl() - (int)(var7 >>> 32), var2.method_10260());
         if (this.iililIlIIiilIl.IlIillIiilIi(var4) && !w.method_8320(var4).method_26215()) {
            return false;
         }
      }

      return true;
   }

   public int IIIllIIliIIl() {
      return this.lllliIlillliIl;
   }

   private void llIililIil(int slotId) {
      if (!gg.corz.lIlIiIliIlIiIl.Illlllllilll() && this.lliIllliliIlll < 0) {
         gg.corz.lIlIiIliIlIiIl.iIlIlllllill(() -> {
            long var5 = 8761511894499311893L;
            class_746 var2 = this.lllilIlillilIl.field_1724;
            if (var2 != null && this.lllilIlillilIl.field_1761 != null && this.llIIiIlilIIiIl == lilIIliiilIIli.illIliiiiIilIliiii && this.IIIIllllIIIlll) {
               if (var2.field_7512 == var2.field_7498) {
                  if (var2.method_6079().method_7909() != class_1802.field_8287) {
                     var5 ^= ((long)(slotId >= 36 ? slotId - 36 : slotId) << 32 ^ var5) & -1L << 32;
                     if (var2.method_31548().method_5438((int)(var5 >>> 32)).method_7909() == class_1802.field_8287) {
                        class_1792 var4 = var2.method_6079().method_7909();
                        this.lllilIlillilIl.field_1761.method_2906(var2.field_7498.field_7763, slotId, 40, class_1713.field_7791, var2);
                        if (this.IIiIllllIiIlll < 0) {
                           this.IIiIllllIiIlll = slotId;
                           this.iIiIlllIliIlll = var4;
                        }
                     }
                  }
               }
            }
         }, true);
      }
   }

   public String Illillliilli() {
      class_2338 var1 = this.iIIIiIlIlIIiIl != null && !this.iIIIiIlIlIIiIl.Iilililiiili() ? this.iIIIiIlIlIIiIl.Ililllililil() : null;
      class_2338 var2 = this.IIIIiIllIIIiIl == null ? null : this.IIIIiIllIIIiIl.IlIillIiilIi();
      StringBuilder var3 = new StringBuilder();
      class_638 var4 = this.lllilIlillilIl.field_1687;
      class_746 var5 = this.lllilIlillilIl.field_1724;
      if (var4 != null && var5 != null) {
         for (class_2338 var7 : this.lilIiIliilIiIl) {
            if (!(var7.method_10262(var5.method_24515()) > 16.0)) {
               var3.append(var7.method_23854().replace(iiIIIlIIlIIl<"iiIIIlIIlIIl","gU9Ff9IC1TDZu9Q+QwHXtafJLGQZMSE4/qvQcDE=">(), ""))
                  .append(
                     var4.method_8320(var7).method_26215()
                        ? iiIIIlIIlIIl<"iiIIIlIIlIIl","0PLIxteBVId3qV+C4LZCvMbIUY4G43UF6G/SmooELDwu">()
                        : (
                           this.IIlilIliiIli(var4, var7)
                              ? iiIIIlIIlIIl<"iiIIIlIIlIIl","T0/3C0s0A2qz0mYTIi7Q2Iz9iGb+Ujm/b7cmIC9iwED9vw==">()
                              : iiIIIlIIlIIl<"iiIIIlIIlIIl","jkas5TdDv06tJPo1+VxlTQYjgg+iBT7bsPPMDHd1eto1Zw==">()
                        )
                  )
                  .append(';');
            }
         }
      }

      return iiIIIlIIlIIl<"iiIIIlIIlIIl","Sx7K1k0RLMMMbP+bs6c+x++yC1nU+eNyFD/wRz8kqBS3">()
         + this.lIiliIliIiliIl
         + iiIIIlIIlIIl<"iiIIIlIIlIIl","dmq/JJPmY7O6mww+I/rNWJmBAKNeIP8SC1aCRA8=">()
         + this.ililiIlIiiliIl
         + iiIIIlIIlIIl<"iiIIIlIIlIIl","I1t2WXKDxTn5UOGoJNUfRfiFps2DY5m10hjUW48HUDiM9A==">()
         + this.liiliIliiiliIl
         + iiIIIlIIlIIl<"iiIIIlIIlIIl","RCPpSUvbj8DDjDItclkh4sr2IEQnUlAqBEN9KnF4FWrzC7Q=">()
         + this.liliiIliiliiIl
         + iiIIIlIIlIIl<"iiIIIlIIlIIl","w/XGIQ5kZ8QXCAC3inWFaxLgla7Iuur62on4JNerzX+j4g==">()
         + this.IlliiIlllliiIl
         + iiIIIlIIlIIl<"iiIIIlIIlIIl","UFOQ6XgQr1Db983mAPE27XWupJSylA4nr5qxpMgTZpk=">()
         + (var1 == null ? iiIIIlIIlIIl<"iiIIIlIIlIIl","Hoq8Ma7BSD2YLzrdR05KJeIXw9JoT1aM0kdh0Mc=">() : var1.method_23854())
         + iiIIIlIIlIIl<"iiIIIlIIlIIl","89PibWi6YNAr5qym9Ygh0wAGbThd8Oqo8r1zVdt0MDVnvv0=">()
         + (
            this.iIIIiIlIlIIiIl == null
               ? iiIIIlIIlIIl<"iiIIIlIIlIIl","Hoq8Ma7BSD2YLzrdR05KJeIXw9JoT1aM0kdh0Mc=">()
               : this.iIIIiIlIlIIiIl.IlIillIiilIi().method_23854()
         )
         + iiIIIlIIlIIl<"iiIIIlIIlIIl","Hbc7+RAfbSARWz9uudMetaA/XL5nSCFF5E3uNwBodwzblQ==">()
         + (var2 == null ? iiIIIlIIlIIl<"iiIIIlIIlIIl","Hoq8Ma7BSD2YLzrdR05KJeIXw9JoT1aM0kdh0Mc=">() : var2.method_23854())
         + iiIIIlIIlIIl<"iiIIIlIIlIIl","4JuqydLIYDLrIdrOyya1HdYMnkub3OHvapAWHub5KyeR+ciM">()
         + (this.lIlIiIliIlIiIl == null ? iiIIIlIIlIIl<"iiIIIlIIlIIl","Hoq8Ma7BSD2YLzrdR05KJeIXw9JoT1aM0kdh0Mc=">() : this.lIlIiIliIlIiIl.method_23854())
         + iiIIIlIIlIIl<"iiIIIlIIlIIl","o6/fB486jbPwmw9KJrA5PjgA8bl4jcE/zEuZVFzmciSH">()
         + (
            this.IliilIllliilIl.IIiilIiiiIii() == null
               ? iiIIIlIIlIIl<"iiIIIlIIlIIl","Hoq8Ma7BSD2YLzrdR05KJeIXw9JoT1aM0kdh0Mc=">()
               : this.IliilIllliilIl.IIiilIiiiIii().method_23854()
         )
         + iiIIIlIIlIIl<"iiIIIlIIlIIl","7tyR5snDJf55HYEwRgBb9smm0nqRmu0DE7SS/zt8JxQYiA==">()
         + this.ilIIIllIiIIIll
         + iiIIIlIIlIIl<"iiIIIlIIlIIl","dmq/JJPmY7O6mww+I/rNWJmBAKNeIP8SC1aCRA8=">()
         + (this.lIIIIlliIIIIll != null)
         + iiIIIlIIlIIl<"iiIIIlIIlIIl","KMa9HnzumQSacoLwcmSESOHd7vcqa+6xVAO7iPZjTp5q1w==">()
         + this.IIiiiIllIiiiIl.size()
         + iiIIIlIIlIIl<"iiIIIlIIlIIl","oGsFnQTS8RgLS8sRnhOLeWNqXoKaIxr8mb/adDenSEFZjNk=">()
         + (this.IliiIlllliiIll == null ? iiIIIlIIlIIl<"iiIIIlIIlIIl","Hoq8Ma7BSD2YLzrdR05KJeIXw9JoT1aM0kdh0Mc=">() : this.IliiIlllliiIll.method_23854())
         + iiIIIlIIlIIl<"iiIIIlIIlIIl","gVVbW4r5XU+Q2DzTsJABx8pXKBi7RumeG5wfXJfdAv4/iDyPEGti">()
         + var3;
   }

   private boolean IIililIili(class_1937 w) {
      return !this.iIIIiIlIlIIiIl.Iilililiiili() && this.iIiliIlili(w) != null;
   }

   private void llIliilIli(class_2338 fc) {
      long var16 = -8481117035292050261L;
      long var18 = -2581328882124436966L;
      long var12 = -6039859496401020357L;
      long var14 = -4768849672303712898L;
      this.IIiiiIllIiiiIl.clear();
      this.iiiiiIlIIIIIll = 0;
      this.IiiiiIlliiiiIl = 0;
      this.lliiiIliliiiIl = null;
      this.iIiiiIlIliiiIl = null;
      class_746 var2 = this.lllilIlillilIl.field_1724;
      var12 ^= ((long)this.iIIliIlIli() << 32 ^ var12) & -1L << 32;
      var12 ^= ((long)this.iIIIiIlIlIIiIl.Iiilliiliiil() ^ var12) & -1L >>> 32;
      var14 ^= ((long)this.iIIIiIlIlIIiIl.Ililllililil().method_10264() << 32 ^ var14) & -1L << 32;
      if (var2 != null) {
         var14 ^= ((long)(this.iIIIiIlIlIIiIl.lIIlllilIl == class_2351.field_11048 ? 1 : 0) ^ var14) & -1L >>> 32;
         var16 ^= ((long)((int)var14 != 0 ? var2.method_31479() : var2.method_31477()) << 32 ^ var16) & -1L << 32;
         var16 ^= ((long)Integer.signum((int)var12 - (int)(var16 >>> 32)) ^ var16) & -1L >>> 32;
         if ((int)var16 == 0) {
            var18 ^= ((long)(this.iIIIiIlIlIIiIl.iiIIlIIlIl() % 2 == 0 != this.iIIIiIlIlIIiIl.iIIlllilIl ? 1 : 0) << 32 ^ var18) & -1L << 32;
            var16 ^= ((long)((int)(var18 >>> 32) != 0 ? 1 : -1) ^ var16) & -1L >>> 32;
         }

         class_2338 var9 = this.iIIIiIlIlIIiIl.IIlilIliiIli((int)(var12 >>> 32), (int)var12 - (int)var16, (int)(var14 >>> 32));
         class_2338 var10 = this.iIIIiIlIlIIiIl.IIlilIliiIli((int)(var12 >>> 32), (int)var12, (int)(var14 >>> 32));
         class_2338 var11 = this.iIIIiIlIlIIiIl.IIlilIliiIli((int)(var12 >>> 32), (int)var12 + (int)var16, (int)(var14 >>> 32));
         if (this.iililIlIIiilIl.IlIillIiilIi(var9)) {
            this.IIiiiIllIiiiIl.add(var9.method_10062());
         }

         if (this.iililIlIIiilIl.IlIillIiilIi(var10)) {
            this.IIiiiIllIiiiIl.add(var10.method_10062());
         }

         if (this.iililIlIIiilIl.IlIillIiilIi(var11)) {
            this.IIiiiIllIiiiIl.add(var11.method_10062());
         }
      } else {
         class_2350 var6 = this.IIlIilIlIi();

         for (long var26 = var16 ^ (0L ^ var16) & -1L << 32; (int)(var26 >>> 32) < 3; var26 += 4294967296L) {
            class_2338 var8 = fc.method_10079(var6, (int)(var26 >>> 32));
            if (this.iililIlIIiilIl.IlIillIiilIi(var8)) {
               this.IIiiiIllIiiiIl.add(var8.method_10062());
            }
         }
      }
   }

   ilIIIIiIiIIIIi IiIlliIliiIl() {
      return this.IililIllililIl;
   }

   private void lilliiilli(String msg) {
      if (liliIliiiliIli.IIIllIIliIIl(this.lllilIlillilIl.field_1724)) {
         this.ilIiIllIiIiIll = false;
      } else if (!this.ilIiIllIiIiIll) {
         this.ilIiIllIiIiIll = true;
         this.llliiillii(msg);
      }
   }

   public void IiiIlliiIl() {
      class_746 var1 = this.lllilIlillilIl.field_1724;
      if (this.llIIiIlilIIiIl == lilIIliiilIIli.illIliiiiIilIliiii && var1 != null && var1.field_3913 != this.lIiilIliIiilIl) {
         this.IiIIiIlliIIiIl = var1.field_3913;
         var1.field_3913 = this.lIiilIliIiilIl;
      }

      this.lIiilIliIiilIl.iIlIlllllill();
      this.IliilIllliilIl.Iilililiiili();
      this.lIlIiIliIlIiIl = null;
   }

   private void lliililiil(class_1937 w) {
      long var8 = -3993770090042691905L;
      long var10 = -9122980339624520225L;
      var8 ^= (0L ^ var8) & -1L << 32;

      while (!this.IIililIili(w) && !this.iIIIiIlIlIIiIl.Iilililiiili()) {
         int var10000 = (int)(var8 >>> 32);
         var8 += 4294967296L;
         if (var10000 >= 4096) {
            break;
         }

         this.iIIIiIlIlIIiIl.IIiilIiiiIii();
      }

      if (!this.IIililIili(w)) {
         this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","3A9GYI80haeJX7jRt8AMaGtAE7O1uaVW4d094a3cr+UN1Ya86LNhFBUnIm0wbQ==">();
      } else {
         class_2338 var3 = this.iIIIiIlIlIIiIl.Ililllililil();
         if (!var3.equals(this.IliliIllliliIl)) {
            if (this.IIilIlllIilIll > 0) {
               this.IIilIlllIilIll--;
            }

            if (this.IliliIllliliIl != null) {
               this.iiiliIIIii(this.IliliIllliliIl);
            }

            this.IIiillIiil();
            this.lliliilili();
            this.IliliIllliliIl = var3.method_10062();
            this.liliiIliiliiIl = 0;
            this.IiliIllliliIll = 0;
            this.IIliIlllIliIll = null;
         }

         if (this.iIIIiIlIlIIiIl.IllIllllIl() != this.illiiIlIiliiIl) {
            this.illiiIlIiliiIl = this.iIIIiIlIlIIiIl.IllIllllIl();
            this.IIilIlllIilIll = 0;
            this.IlliiIlllliiIl = false;
            this.llIliilIli(var3);
            this.IIIIiIllIIIiIl.IliIlllilIi();
            this.lililiilil(llliIiIiilliIiIi.IiiIiIiIIi);
            this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","HssoMzz7epfFrxgVerDjiCj6i9wVKf/3HN3AZ0HKJnjUv5pyLRcBUDSA4Y/fZ25Ljj71xzvWoaljcQvUCpbEsqmbPCIdlQ==">();
         }

         class_746 var4 = this.lllilIlillilIl.field_1724;
         if (var4 == null || !this.IiIliliIli(w, var4)) {
            this.ililiIlIiiliIl++;
            var8 ^= (
                  (long)(
                        this.lIlIiIliIlIiIl == null
                              && this.IliilIllliilIl.IIiilIiiiIii() == null
                              && !this.IIIIiIllIIIiIl.lIiiIiIlilli()
                              && !this.IIIIiIllIIIiIl.iliIiiliiiii()
                              && !this.iIIiiIlIlIiiIl
                           ? 0
                           : 1
                     )
                     ^ var8
               )
               & -1L >>> 32;
            this.liiliIliiiliIl = (int)var8 != 0 ? 0 : this.liiliIliiiliIl + 1;
            if (this.IIIIiIllIIIiIl.iliIiiliiiii()) {
               this.liiliIliiiliIl = 0;
            }

            if (this.liiliIliiiliIl > 160 && !this.IIIIiIllIIIiIl.iliIiiliiiii()) {
               this.liiliIliiiliIl = 0;
               this.liliiIliiliiIl++;
               this.Iiililiili();
               switch (this.liliiIliiliiIl % 3) {
                  case 1:
                     this.IIilIlllIilIll = 3;
                     this.IlliiIlllliiIl = true;
                     this.IIIIiIllIIIiIl.IliIlllilIi();
                     this.lililiilil(llliIiIiilliIiIi.IiiIiIiIIi);
                     this.llliiillii(
                        iiIIIlIIlIIl<"iiIIIlIIlIIl","6rRSvfDmVqcX8eOmGkNRZn0xWifkCigOUmkndwce118lU0gI8ChgHXaP5eGJ5HUOM64AxAkZ7gud68aGvfSRUBaItlCc+eQuRc67n9nFf+G9bg==">()
                     );
                     break;
                  case 2:
                     this.iIilIllIlilIll.clear();
                     this.IIIIiIllIIIiIl.IliIlllilIi();
                     this.lililiilil(llliIiIiilliIiIi.liiIiIiIIi);
                     this.llliiillii(
                        iiIIIlIIlIIl<"iiIIIlIIlIIl","k4OD9IHINorphSgWd4ijK4dUCslvl88CBFWq+vAYcrES59E+QWJIOvlZnSl/FOgQGtYJx6SnkqCC8DOD7HOBtxSciG3CJUW1GKNxv2+QcMLc80sFlw==">()
                     );
                     break;
                  default:
                     this.iIilIllIlilIll.clear();
                     this.IIilIlllIilIll = 0;
                     this.IlliiIlllliiIl = false;
                     this.IIIIiIllIIIiIl.IliIlllilIi();
                     this.lililiilil(llliIiIiilliIiIi.IiiIiIiIIi);
                     this.llliiillii(
                        iiIIIlIIlIIl<"iiIIIlIIlIIl","kmKbxyJWKCYazAs7z/hFoCp9oVctwVl6FGdIXNXjXatWIlDH/MIwdBcUjFxpUQnMDG/vvRCvp7siq2BjCqzVJtNkcVcqCfdrx99MRQ==">()
                     );
               }
            } else {
               var10 ^= ((long)(var4 != null && var3.method_10262(var4.method_24515()) <= 36.0 ? 1 : 0) << 32 ^ var10) & -1L << 32;
               if ((int)(var10 >>> 32) != 0 && this.liiliIliiiliIl > 60 && this.IIiiiIllIiiiIl.isEmpty() && !this.IIIIiIllIIIiIl.iliIiiliiiii()) {
                  this.llIliilIli(var3);
                  this.IIiiiIllIiiiIl.removeIf(wx -> !this.IlIiillIii(w, wx));
                  if (!this.IIiiiIllIiiiIl.isEmpty()) {
                     this.IIilIlllIilIll = 0;
                     this.IlliiIlllliiIl = false;
                     this.IIIIiIllIIIiIl.IliIlllilIi();
                     this.liiliIliiiliIl = 0;
                     this.lililiilil(llliIiIiilliIiIi.IiiIiIiIIi);
                     this.llliiillii(
                        iiIIIlIIlIIl<"iiIIIlIIlIIl","5RFxYnwywweqq2ACz5JS4B8pP16NTyV2tQMtQteB0SW1TNqEydew1Jlxb1oXuQ7E3RZ+AFWtymPE09OS57V+o2A3BZB1CdJW">()
                     );
                  }
               }

               class_2338 var7 = this.iIiliIlili(w);
               if (var7 != null) {
                  switch (this.lIiliIliIiliIl) {
                     case liiIiIiIIi:
                        this.iiIliIIlli(w, var3);
                        break;
                     case IiiIiIiIIi:
                        this.Illlilllli(w, var7);
                        break;
                     case IIIliIiIIi:
                        this.lIlliiIlli(w, var7);
                        break;
                     case iiiIiIiIIi:
                        this.illliIilli(w, var7);
                  }
               }
            }
         }
      }
   }

   private int IIIillIIil(class_1937 pos, class_2338 w) {
      long var7 = -6337585766200845784L;
      long var9 = -6720432621364299329L;
      var7 ^= (0L ^ var7) & -1L << 32;

      for (var7 ^= ~var7 & -1L >>> 32; (int)var7 <= 1; var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32) {
         var9 ^= (-4294967296L ^ var9) & -1L << 32;

         while ((int)(var9 >>> 32) <= 1) {
            for (var9 ^= ~var9 & -1L >>> 32; (int)var9 <= 1; var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
               if (((int)var7 | (int)(var9 >>> 32) | (int)var9) != 0 && this.IlIiillIii(pos, w.method_10069((int)var7, (int)(var9 >>> 32), (int)var9))) {
                  var7 += 4294967296L;
               }
            }

            var9 += 4294967296L;
         }
      }

      return (int)(var7 >>> 32);
   }

   private void lIlIliIlIl() {
      if (this.llIIiIlilIIiIl == lilIIliiilIIli.illIliiiiIilIliiii) {
         this.iiIIlIIlIl();
         this.iiIIiIlIIlIiIl = true;
      }
   }

   private boolean Iliilliiilii(class_1937 stand, class_746 p, class_2338 w) {
      long var10 = -8348455354123528297L;
      class_2338[] var4 = new class_2338[]{w, w.method_10084()};
      var10 ^= ((long)var4.length << 32 ^ var10) & -1L << 32;

      for (long var13 = var10 ^ (0L ^ var10) & -1L >>> 32; (int)var13 < (int)(var13 >>> 32); var13 ^= (var13 ^ var13 + (long)1) & -1L >>> 32) {
         class_2338 var7 = var4[(int)var13];
         if (this.lilIiIliilIiIl.contains(var7) && !stand.method_8320(var7).method_26215()) {
            if (!this.IIlilIliiIli(stand, var7) && this.iililIlIIiilIl.IlIillIiilIi(var7)) {
               double var8 = Math.max(this.IililIllililIl.iIiiIIiliIliiIIili, p.method_55754());
               if (!this.IliilIllliilIl.IIlllIlliIll(var7, var8)) {
                  return false;
               }

               this.lIiilIliIiilIl.iIlIlllllill();
               this.Ilillllill(var7, var8, false);
               this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","KQsUQJgXeOsOgSzhP77z9ypm1jT8GLc3xWXO7BFRcBphyeWWqguhQNi0nua9MLMo7LoRv3HhhC2f6V/bGZaW1EvRk5yQz31+Kzg=">();
               return true;
            }

            this.iIilIllIlilIll.add(w.method_10062());
            this.IIIIiIllIIIiIl.IliIlllilIi();
            this.lililiilil(llliIiIiilliIiIi.liiIiIiIIi);
            this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","3G04pdIX+wy5ho7/+T95YaozMjIe16zu6xeDJQ5Aws2MjLuxGSmH07VOZSAZwmYGFNMP0tmVwrjzlSBQskLBks5N4p2ncUOgIICqD+HCaXNg85Tbf3NfCPuTvFjOyQrDmol3">();
            return true;
         }
      }

      return false;
   }

   private boolean iIlIiIllIi(class_1937 w) {
      long var5 = -3442339015276176261L;
      var5 ^= (0L ^ var5) & -1L << 32;

      for (class_2338 var4 : this.iIIIiIlIlIIiIl.IIillIiliIil()) {
         if (!this.iililIlIIiilIl.IlIillIiilIi(var4) || !this.IlIiillIii(w, var4)) {
            return false;
         }

         var5 += 4294967296L;
      }

      return (int)(var5 >>> 32) == 9;
   }

   private static float liiIiiiiIi(double v) {
      if (Math.abs(v) < 0.18) {
         return 0.0F;
      } else {
         return v > 0.0 ? 1.0F : -1.0F;
      }
   }

   void llliiillii(String msg) {
      if (this.lllilIlillilIl.field_1724 != null) {
         this.lllilIlillilIl
            .field_1724
            .method_7353(class_2561.method_43470(iiIIIlIIlIIl<"iiIIIlIIlIIl","/IcBM3fk2h4Co97/myE7uYhe1r7/4oHhZ0pWcqELVkn546Q/WkyqBcW5">() + msg), false);
      }
   }

   private void iIIIlIlIIl(class_2338 why, String pos) {
      class_2338 var3 = why.method_10062();
      if (!this.lIllIlliIllIll.containsKey(var3)) {
         long var4 = System.currentTimeMillis();
         if (var4 - this.liIiIlliiIiIll > 10000L) {
            this.liIiIlliiIiIll = var4;
            this.llliiillii(
               iiIIIlIIlIIl<"iiIIIlIIlIIl","ilFLjjz3NeW59tqWDEvkqvw91gMyRZdajLQQMpT64VNnpde4yUqYeNPz">()
                  + var3.method_23854()
                  + iiIIIlIIlIIl<"iiIIIlIIlIIl","tbSy+78GADkSg4UwD3MPf0SyNhMQ/70tDT7UPX8FqjPs">()
                  + pos
            );
         }
      }

      this.lIllIlliIllIll.put(var3, 600);
      this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","w9COc+hP3clAAvQLjHDZs1yvEjlrTI2fjvTUW8QuE/KyadRxtAoA">()
         + var3.method_23854()
         + iiIIIlIIlIIl<"iiIIIlIIlIIl","tbSy+78GADkSg4UwD3MPf0SyNhMQ/70tDT7UPX8FqjPs">()
         + pos;
   }

   private void IIllllIlll() {
      this.IiiIiIlliiIiIl = true;
      this.iiiIiIlIIIliIl = true;
      this.lIIliIliIIliIl.clear();
      this.ilIliIlIiIliIl = this.iililIlIIiilIl.Iilllilliill();
      this.IlIliIlllIliIl = this.iililIlIIiilIl.IlIlllIlilIl();
      this.liIliIliiIliIl = this.iililIlIIiilIl.IIlllIlliIll();
      this.IIlliIllIlliIl = 0;
      this.lIllIlliIllIll.clear();
      this.iIilIllIlilIll.clear();
      this.lliliilili();
      this.iiliIllIIiiIll = iiIIIlIIlIIl<"iiIIIlIIlIIl","dvTL3Pwvt2U+8cJJAsFuVwdsqz2RFTm/R+STaFA+fG1z1Gj1x0uuyDP2eBd0wLFmjdE8pSjyGw5b5EFqw2DA3joLFQ==">();
   }

   public void lliIliliIl() {
      long var2 = 4944075321096016163L;
      var2 ^= ((long)this.iliilIlIiiilIl.IIIllIIliIIl(this.lllilIlillilIl.field_1724, this.lllilIlillilIl.field_1687) << 32 ^ var2) & -1L << 32;
      if ((int)(var2 >>> 32) != 0 && (this.llIIiIlilIIiIl == lilIIliiilIIli.illIliiiiIilIliiii || this.iiIIiIlIIlIiIl)) {
         this.liiilIliiiilIl.lIiiIiIlilli();
         this.IllIllllIl();
      }

      if (this.llIIiIlilIIiIl == lilIIliiilIIli.illIliiiiIilIliiii) {
         if ((int)(var2 >>> 32) == 0 && this.liiilIliiiilIl.IliIlllilIi()) {
            this.lIlIliIlIl();
         }
      } else if (this.llIIiIlilIIiIl == lilIIliiilIIli.lilIliiiiiilIliiii && this.iiIIiIlIIlIiIl && !this.liiilIliiiilIl.IliIlllilIi()) {
         this.IllIllllIl();
      }

      this.iiiIlIIIll();
   }

   private void IiIIlliIIl() {
      this.lIiiIlliIiiIll = null;
      this.IliiIlllliiIll = null;
      this.iliiIllIiiiIll = null;
      this.liiiIlliiiiIll = 0;
      this.lIIlllliIIllll = false;
      this.IIIIllllIIIlll = false;
      this.IiIIlllliIIlll = false;
      this.IllIllllllIlll = 0;
      this.illIlllIilIlll = false;
      this.lilIllliilIlll = 0;
      this.llIIlllilIIlll = 0;
      this.IIiIllllIiIlll = -1;
      this.iIiIlllIliIlll = null;
   }

   private int iIIliIlIli() {
      long var3 = 7771932617419720746L;
      if (this.iIIIiIlIlIIiIl == null) {
         return 0;
      } else {
         var3 ^= ((long)this.iIIIiIlIlIIiIl.IIIIllIIIl() << 32 ^ var3) & -1L << 32;
         var3 ^= ((long)this.iIIIiIlIlIIiIl.iIIIlIlIIl() ^ var3) & -1L >>> 32;
         if ((int)var3 - (int)(var3 >>> 32) >= 2) {
            return this.iIIIiIlIlIIiIl.IlIlllIlilIl() > 0 ? (int)(var3 >>> 32) + 1 : (int)var3 - 1;
         } else {
            return this.iIIIiIlIlIIiIl.IiIlliIliiIl();
         }
      }
   }

   private int liIlliiIll(class_1937 lo, int w, int hi) {
      long var8 = 129433954512276887L;
      long var10 = 8160615751076001088L;
      var8 ^= (0L ^ var8) & -1L << 32;

      for (var8 ^= ((long)hi ^ var8) & -1L >>> 32; (int)var8 >= w; var8 ^= (var8 ^ var8 + (long)-1) & -1L >>> 32) {
         var10 ^= ((long)this.iIIIiIlIlIIiIl.IIIIllIIIl() << 32 ^ var10) & -1L << 32;

         while ((int)(var10 >>> 32) <= this.iIIIiIlIlIIiIl.iIIIlIlIIl()) {
            for (var10 ^= ((long)this.iIIIiIlIlIIiIl.llIIlilIIl() ^ var10) & -1L >>> 32;
               (int)var10 <= this.iIIIiIlIlIIiIl.IiIIlliIIl();
               var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32
            ) {
               if (this.IIliilIlii(lo, this.iIIIiIlIlIIiIl.IIlilIliiIli((int)(var10 >>> 32), (int)var10, (int)var8))) {
                  var8 += 4294967296L;
               }
            }

            var10 += 4294967296L;
         }
      }

      return (int)(var8 >>> 32);
   }

   private void iiIilIIlil() {
      long var4 = -3617474035340465127L;
      if (this.lliIllliliIlll >= 0) {
         class_746 var1 = this.lllilIlillilIl.field_1724;
         if (var1 == null || var1 != this.iiiIlllIIIllll || this.lllilIlillilIl.field_1761 == null) {
            this.lliIllliliIlll = -1;
            this.IiiIlllliiIlll = null;
            this.iiiIlllIIIllll = null;
         } else if (!gg.corz.lIlIiIliIlIiIl.Illlllllilll()) {
            var4 ^= ((long)this.lliIllliliIlll << 32 ^ var4) & -1L << 32;
            class_1792 var3 = this.IiiIlllliiIlll;
            gg.corz.lIlIiIliIlIiIl.iIlIlllllill(
               () -> {
                  long var7 = -3471755873787067071L;
                  class_746 var3x = this.lllilIlillilIl.field_1724;
                  if (var3x != null && this.lllilIlillilIl.field_1761 != null && this.lliIllliliIlll == slotId) {
                     if (var3x.field_7512 == var3x.field_7498) {
                        var7 ^= ((long)(slotId >= 36 ? slotId - 36 : slotId) << 32 ^ var7) & -1L << 32;
                        class_1799 var5 = var3x.method_31548().method_5438((int)(var7 >>> 32));
                        var7 ^= (
                              (long)(
                                    var3 != null && var3 != class_1802.field_8162
                                       ? (var5.method_7909() == var3 && var3x.method_6079().method_7909() != var3 ? 1 : 0)
                                       : (var3x.method_6079().method_7909() == class_1802.field_8287 && var5.method_7960() ? 1 : 0)
                                 )
                                 ^ var7
                           )
                           & -1L >>> 32;
                        if ((int)var7 != 0) {
                           this.lllilIlillilIl.field_1761.method_2906(var3x.field_7498.field_7763, slotId, 40, class_1713.field_7791, var3x);
                        }

                        this.lliIllliliIlll = -1;
                        this.IiiIlllliiIlll = null;
                        this.iiiIlllIIIllll = null;
                     }
                  }
               },
               true
            );
         }
      }
   }
}
