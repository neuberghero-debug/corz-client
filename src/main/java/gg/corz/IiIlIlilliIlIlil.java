package gg.corz;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public final class IiIlIlilliIlIlil {
   public static final String illlIIiIil = "Cherry MX Blue";
   private final int IiilIIiIil;
   static final String lIilIIiIil = "/assets/corzclient/creamykeys/";
   public static final String IillIIiIil = "Holy Pandas";
   public static final String[] iillIIiIil = new String[]{
      Illlllllilll<"Illlllllilll","sIdKPSUI1R8FaHlFK6DoNRtvylnXMYcp1gjq2epczLguXn+0">(),
      Illlllllilll<"Illlllllilll","oZtDDW9aczJHDCM0Q4MiEmOvwyBN3Ct4jLTL3TanmlJ3W75xU3vBSWNG">(),
      Illlllllilll<"Illlllllilll","/fzCyLKvK52Zz9MpfwVix2gTWWXzbH3ahnsy0/+DlUingPJApPsA">(),
      Illlllllilll<"Illlllllilll","8c6ugFw3Iuqiv/EwMzN+H297S1OhOsKhm92FdDKnABtd">()
   };
   static final String[] IIilIIiIil = new String[]{
      Illlllllilll<"Illlllllilll","eOIzXniWrrC09eJtotFsg+uhmtOxKBBkwJ6oBrLT5XEr4knz">(),
      Illlllllilll<"Illlllllilll","0rmA37YAdcE6CDMiqJXxmnozWt3ephWIn8+lOrpPiFngBBjcv5ddGWtDMdW/">(),
      Illlllllilll<"Illlllllilll","JOytzmGV46Vrw6kPP17dOUunduUGvaZf5xoVBoQobss36JAA8uKF">(),
      Illlllllilll<"Illlllllilll","6U0FIb9wC41+UtmOOyoG7KpyLkd12tpa8NvE7xKDIp0xBPJFc07ipW+O/BchfzM4ipAC">()
   };
   private final Map<Integer, Integer> llilIIiIil;
   public final illIIIliIilIIIli[] IlilIIiIil;
   private final Map<Integer, Integer> ililIIiIil;
   public static final String llllIIiIil = "NK Cream";
   public final int iIilIIiIil;
   public static final String lillIIiIil = "Topre";

   private static int IlIlllIlilIl(
      iIlIlIlIllIlIl clips, ilIllllIiIllll clip, Map<String, illIIIliIilIIIli> decoded, Map<iIlIlIlIllIlIl, Integer> files, List<illIIIliIilIIIli> ids
   ) {
      long var9 = 6263535097091421119L;
      if (clips == null) {
         return -1;
      } else {
         Integer var5 = (Integer)files.get(clips);
         if (var5 != null) {
            return var5;
         } else {
            var9 ^= (-4294967296L ^ var9) & -1L << 32;
            illIIIliIilIIIli var7 = (illIIIliIilIIIli)decoded.get(clips.liiiIIllIl());
            if (var7 == null && !decoded.containsKey(clips.liiiIIllIl())) {
               try {
                  var7 = clip.load(clips.liiiIIllIl());
               } catch (RuntimeException | IOException var11) {
                  var7 = null;
               }

               decoded.put(clips.liiiIIllIl(), var7);
            }

            if (var7 != null) {
               illIIIliIilIIIli var8 = clips.IliIlllilIi() ? var7.iIlIlllllill(clips.iIlIlllllill(), clips.IilliliilIIi()) : var7;
               if (var8.IliIlllilIi() > 0) {
                  var9 ^= ((long)ids.size() << 32 ^ var9) & -1L << 32;
                  ids.add(var8);
               }
            }

            files.put(clips, (int)(var9 >>> 32));
            return (int)(var9 >>> 32);
         }
      }
   }

   public static int liiiIIllIl(int preset) {
      return preset >= 0 && preset < iillIIiIil.length ? preset : 0;
   }

   public int lIiiIiIlilli(int code) {
      Integer var2 = this.llilIIiIil.get(code);
      return var2 != null ? var2 : this.IiilIIiIil;
   }

   public int iliIiiliiiii(int code) {
      Integer var2 = this.ililIIiIil.get(code);
      return var2 != null ? var2 : -1;
   }

   private IiIlIlilliIlIlil(int fallbackDown, illIIIliIilIIIli[] clips, Map<Integer, Integer> preset, Map<Integer, Integer> down, int up) {
      this.iIilIIiIil = fallbackDown;
      this.IlilIIiIil = clips;
      this.llilIIiIil = preset;
      this.ililIIiIil = down;
      this.IiilIIiIil = up;
   }

   public static IiIlIlilliIlIlil IilliliilIIi(int preset, IIIililllIIilill pack, ilIllllIiIllll files) {
      HashMap var3 = new HashMap();
      HashMap var4 = new HashMap();
      ArrayList var5 = new ArrayList();
      TreeSet var6 = new TreeSet<>(pack.lIiiIiIlilli());

      for (int var10 : illiilIiliil.IIIllIIliIIl()) {
         var6.add(var10);
      }

      HashMap var13 = new HashMap();
      HashMap var14 = new HashMap();

      for (int var17 : var6) {
         int var11 = IlIlllIlilIl(pack.liiiIIllIl(var17), files, var3, var4, var5);
         if (var11 >= 0) {
            var13.put(var17, var11);
         }

         int var12 = IlIlllIlilIl(pack.iIlIlllllill(var17), files, var3, var4, var5);
         if (var12 >= 0) {
            var14.put(var17, var12);
         }
      }

      int var16 = IlIlllIlilIl(pack.liiiIIllIl(-1), files, var3, var4, var5);
      return new IiIlIlilliIlIlil(preset, var5.toArray(new illIIIliIilIIIli[0]), var13, var14, var16);
   }

   public static int IliIlllilIi(String name) {
      for (int var1 = 0; var1 < iillIIiIil.length; var1++) {
         if (iillIIiIil[var1].equals(name)) {
            return var1;
         }
      }

      return 0;
   }

   public static IiIlIlilliIlIlil iIlIlllllill(int preset) {
      long var4 = 2529506360607301781L;
      var4 ^= ((long)liiiIIllIl(preset) << 32 ^ var4) & -1L << 32;
      String var2 = Illlllllilll<"Illlllllilll","g+n/HFiy819KOJFHVbALeiRawg5g2CvUFMj0Z5ayIp1L3UGqkgm+CJKzfKzx38CdMW5aha2jMYUneg==">()
         + IIilIIiIil[(int)(var4 >>> 32)]
         + Illlllllilll<"Illlllllilll","TOUMYNcl5WHk8zyf4pQu3bZWyGPO/gsAn52+eJg=">();
      IIIililllIIilill var3 = IIIililllIIilill.IliIlllilIi(
         new String(IiIlliIliiIl(var2 + Illlllllilll<"Illlllllilll","H7zSqRD3GKf49PVPPwJ4+5d5nNuOlayb6tEq2LmuoduBExNdhuoO">()), StandardCharsets.UTF_8)
      );
      return IilliliilIIi(
         (int)(var4 >>> 32),
         var3,
         file -> {
            byte[] var2x = IiIlliIliiIl(var2 + file);
            return file.toLowerCase().endsWith(Illlllllilll<"Illlllllilll","HOUEY7eFKc18kIb8LbsgRSUOcfqIKfUQwxnmoi2JVvs=">())
               ? ilIliilIiIliil.IliIlllilIi(var2x)
               : illIIIliIilIIIli.liiiIIllIl(var2x);
         }
      );
   }

   private static byte[] IiIlliIliiIl(String path) {
      byte[] var2;
      try (InputStream var1 = IiIlIlilliIlIlil.class.getResourceAsStream(path)) {
         if (var1 == null) {
            throw new IOException(Illlllllilll<"Illlllllilll","C2f2Iva5jK6zF0hbzTsycjlMMoa6RHtez4uVXJMM8ob8n7NC">() + path);
         }

         var2 = var1.readAllBytes();
      }

      return var2;
   }

   public long IIIllIIliIIl() {
      long var1 = 0L;

      for (illIIIliIilIIIli var6 : this.IlilIIiIil) {
         var1 += (long)var6.IIlllIlliIll().length;
      }

      return var1;
   }
}
