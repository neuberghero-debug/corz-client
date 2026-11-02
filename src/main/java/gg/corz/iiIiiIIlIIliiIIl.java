package gg.corz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;

public final class iiIiiIIlIIliiIIl {
   public static final int ilIiIlilIl = 50;
   private static final llIIIIlilIIIIl liIiIlilIl = new llIIIIlilIIIIl(0L, 0L, 0L);
   public static final long IiIiIlilIl = 600000L;

   public static boolean IilliliilIIi(llililIlilililIl scan, IiIillIlliIillIl l, llIIIIlilIIIIl nowMs, long rules) {
      return scan != null && l != null ? l.equals(iIlIlllllill(scan, nowMs, rules).IliIlllilIi()) : false;
   }

   private static IiIillIlliIillIl IlIlllIlilIl(IiIillIlliIillIl scannedAtMs, long nowMs, long l) {
      long var5 = iiiiiliIIIIIii.IliIlllilIi(scannedAtMs, nowMs, l);
      return var5 == scannedAtMs.IlIlllIlilIl()
         ? scannedAtMs
         : new IiIillIlliIillIl(
            scannedAtMs.liiiIIllIl(),
            scannedAtMs.iIlIlllllill(),
            scannedAtMs.IilliliilIIi(),
            scannedAtMs.lIiiIiIlilli(),
            scannedAtMs.iliIiiliiiii(),
            scannedAtMs.IIIllIIliIIl(),
            var5,
            scannedAtMs.IiIlliIliiIl(),
            scannedAtMs.IIlllIlliIll()
         );
   }

   public static boolean lIiiIiIlilli(llililIlilililIl nowMs, long scan) {
      return nowMs == null || scan - nowMs.IIillIiliIil() > 600000L;
   }

   public static IiIillIlliIillIl IIIllIIliIIl(llililIlilililIl l, IiIillIlliIillIl scan, long nowMs) {
      return l != null && scan != null && l.IilliliilIIi().contains(scan) ? IlIlllIlilIl(scan, l.IIillIiliIil(), nowMs) : scan;
   }

   public static llililIlilililIl iIlIlllllill(llililIlilililIl rules, llIIIIlilIIIIl scan, long nowMs) {
      long var17 = 6740427070488916886L;
      long var19 = 1925476286371970484L;
      long var15 = 567783337219319087L;
      if (rules == null) {
         return null;
      } else {
         llIIIIlilIIIIl var4 = scan == null ? liIiIlilIl : scan;
         List var5 = rules.IilliliilIIi();
         IdentityHashMap var6 = new IdentityHashMap(var5.size() * 2);
         ArrayList var7 = new ArrayList(var5.size());
         var15 ^= (0L ^ var15) & -1L << 32;
         var15 ^= (0L ^ var15) & -1L >>> 32;
         var17 ^= (0L ^ var17) & -1L << 32;

         for (IiIillIlliIillIl var12 : var5) {
            IiIillIlliIillIl var13 = IlIlllIlilIl(var12, rules.IIillIiliIil(), nowMs);
            var6.put(var13, var12);
            var7.add(var13);
            if (var13.IlIlllIlilIl() <= 0L || var13.IlIlllIlilIl() < var4.liiiIIllIl()) {
               var15 += 4294967296L;
            }

            if (var4.IliIlllilIi() > 0L && var13.IIIllIIliIIl() > var4.IliIlllilIi()) {
               var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32;
            }

            if (var4.iIlIlllllill() > 0L && var13.IIIllIIliIIl() > var4.iIlIlllllill()) {
               var17 += 4294967296L;
            }
         }

         List var21 = lIlilIIiiIlilIIi.IliIlllilIi(var7, var4);
         var17 ^= ((long)Math.min(50, var21.size()) ^ var17) & -1L >>> 32;
         ArrayList var22 = new ArrayList((int)var17);

         for (long var27 = var19 ^ (0L ^ var19) & -1L << 32; (int)(var27 >>> 32) < (int)var17; var27 += 4294967296L) {
            var22.add((IiIillIlliIillIl)var6.get(var21.get((int)(var27 >>> 32))));
         }

         return new llililIlilililIl(
            rules.liiiIIllIl(),
            var22,
            var5,
            rules.lIiiIiIlilli(),
            rules.iliIiiliiiii(),
            rules.IIIllIIliIIl(),
            (int)(var15 >>> 32),
            (int)var15,
            (int)(var17 >>> 32),
            rules.Illlllllilll(),
            rules.Iilllilliill(),
            rules.IIillIiliIil()
         );
      }
   }

   public static llililIlilililIl IliIlllilIi(
      iIiiIIlIliiIIl pages, Collection<IiIillIlliIillIl> kind, int scannedAtMs, llIIIIlilIIIIl opened, int rules, boolean found, long fakes
   ) {
      return liiiIIllIl(pages, kind, scannedAtMs, 0, opened, rules, found, fakes);
   }

   public static llililIlilililIl iliIiiliiiii(llililIlilililIl gone, IiIillIlliIillIl scan) {
      if (gone != null && scan != null) {
         List var2 = IiIlliIliiIl(gone.iIlIlllllill(), scan);
         List var3 = IiIlliIliiIl(gone.IilliliilIIi(), scan);
         return var2 == null && var3 == null
            ? gone
            : new llililIlilililIl(
               gone.liiiIIllIl(),
               var2 == null ? gone.iIlIlllllill() : var2,
               var3 == null ? gone.IilliliilIIi() : var3,
               var3 == null ? gone.lIiiIiIlilli() : Math.max(0, gone.lIiiIiIlilli() - 1),
               gone.iliIiiliiiii(),
               gone.IIIllIIliIIl(),
               gone.IlIlllIlilIl(),
               gone.IiIlliIliiIl(),
               gone.IIlllIlliIll(),
               gone.Illlllllilll(),
               gone.Iilllilliill(),
               gone.IIillIiliIil()
            );
      } else {
         return gone;
      }
   }

   private static List<IiIillIlliIillIl> IiIlliIliiIl(List<IiIillIlliIillIl> gone, IiIillIlliIillIl list) {
      long var4 = 1809230935052206807L;
      var4 ^= ((long)gone.indexOf(list) << 32 ^ var4) & -1L << 32;

      for (var4 ^= (0L ^ var4) & -1L >>> 32; (int)(var4 >>> 32) < 0 && (int)var4 < gone.size(); var4 ^= (var4 ^ var4 + (long)1) & -1L >>> 32) {
         if (IIlllIlliIll((IiIillIlliIillIl)gone.get((int)var4), list)) {
            var4 ^= ((long)((int)var4) << 32 ^ var4) & -1L << 32;
         }
      }

      if ((int)(var4 >>> 32) < 0) {
         return null;
      } else {
         ArrayList var3 = new ArrayList(gone);
         var3.remove((int)(var4 >>> 32));
         return var3;
      }
   }

   private static boolean IIlllIlliIll(IiIillIlliIillIl a, IiIillIlliIillIl b) {
      return a.liiiIIllIl() == b.liiiIIllIl()
         && a.iIlIlllllill() == b.iIlIlllllill()
         && a.IilliliilIIi() == b.IilliliilIIi()
         && a.IIlllIlliIll() != null
         && a.IIlllIlliIll().equals(b.IIlllIlliIll());
   }

   private iiIiiIIlIIliiIIl() {
   }

   public static llililIlilililIl liiiIIllIl(
      iIiiIIlIliiIIl kind, Collection<IiIillIlliIillIl> opened, int scannedAtMs, int unread, llIIIIlilIIIIl pages, int fakes, boolean found, long rules
   ) {
      ArrayList var9 = new ArrayList();
      if (opened != null) {
         for (IiIillIlliIillIl var11 : opened) {
            if (var11 != null && var11.liiiIIllIl() == kind) {
               var9.add(var11);
            }
         }
      }

      llililIlilililIl var12 = new llililIlilililIl(
         kind, List.of(), var9, var9.size(), Math.max(0, scannedAtMs), Math.max(0, unread), 0, 0, 0, Math.max(0, fakes), found, rules
      );
      return iIlIlllllill(var12, pages, rules);
   }
}
