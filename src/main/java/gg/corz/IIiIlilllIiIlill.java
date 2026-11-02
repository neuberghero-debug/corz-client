package gg.corz;

import com.corz.client.CorzClient;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents.Load;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents.Unload;
import net.minecraft.class_1299;
import net.minecraft.class_1923;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_2806;
import net.minecraft.class_2818;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_638;
import net.minecraft.class_642;
import org.joml.Matrix4f;

public class IIiIlilllIiIlill extends ilIllIiIll {
   private int iiiiiilill;
   private final iiIiiilIIliiil ililiilill;
   private static final int IIlIIIiill = 48;
   private final iiIiiilIIliiil Iiiliilill;
   private static final int IiIIIIiill = 16;
   private final int[] illIIIiill;
   private int liiiiilill;
   private final IIIiIiIllIIiIiIl liliiilill;
   private final iliiliilIiiiliil llliiilill;
   private final IIIIlilllIIIlill liIiiilill;
   private final iliiliilIiiiliil IIliiilill;
   private final iiIiiilIIliiil lliliilill;
   private final iiIiiilIIliiil iIiliilill;
   private final iilliIlIIiliIl lIIiiilill;
   private final iilliIlIIiliIl IlIiiilill;
   private final iilliIlIIiliIl iiiliilill;
   private final iiIiiilIIliiil liiliilill;
   private static final int iiIIIIiill = 64;
   private final String[] iIlIIIiill;
   private final llliiillii lIiiiilill;
   private volatile List<lliliillililiill> IIIIIIiill;
   private final iilliIlIIiliIl iIIiiilill;
   private final iliiliilIiiiliil Illiiilill;
   private static final int liIIIIiill = 100;
   private final IIIIlilllIIIlill IiIiiilill;
   private final iiIiiilIIliiil IIiliilill = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","Hhfpq30swf8i1afiCvzfC7m2sAS13FmtU0Knw+AZNj0Z+vzHqG2L1x3yK/Je">(),
      IliIlllilIi<"IliIlllilIi","hO74AY57TxCeyp51mbNecNGU8PTKhjnlGEhmCQx9g/Nzzticdy50i8Lycfm+cJ8aeYsASn/ve0rrEbWvUDgjnNGS4UYApYJKuL0tI3pylGUZ5mbXnjfYM1bGhVwExF2jcLGyadMwkaxhNdMmo9MNMiInch8wzSEZOJiZ0yYUj4USSUk7rYh7QhIOoDqAvyQ7QDfvn5VKjIRTVL6PfXasprGAmt4CNnAT+EKozkM=">(),
      true
   );
   private final Map<Long, Integer> iIiiiilill;
   private final iilliIlIIiliIl llIiiilill;
   private final ililliIiIiilliIi Iiliiilill;
   private final IIillIillIillIil iiliiilill;
   private static final long lIlIIIiill = 30000L;
   private static final int IlIIIIiill = 100;
   private int Iiiiiilill;
   public static volatile IIiIlilllIiIlill iilliilill;
   private int iliiiilill;
   private static final int ilIIIIiill = 32;
   private final Map<String, String> Iliiiilill;
   private final iliiliilIiiiliil iiIiiilill;
   private final iliiliilIiiiliil lIliiilill;
   private final iiIiiilIIliiil Ililiilill;
   private final IIIIlilllIIIlill ilIiiilill;
   private class_638 lliiiilill;
   private final float[] IllIIIiill;
   private final iliiliilIiiiliil illiiilill;
   private long iIIIIIiill;
   private final lliliIIiililiIIi lIiliilill = new lliliIIiililiIIi(
      IliIlllilIi<"IliIlllilIi","6ekXkPLKaloZ5MrtP92ujztXM3kJWJfVWRSMhtoD8A==">(),
      IliIlllilIi<"IliIlllilIi","9n9o1FHjPEZTyK4pv3EcjeRVZ229N2hwqxjDyUfKTEnIhJaR/LvwUzw6nIBpe9u7uf1TacgJKi1cmOg=">(),
      IliIlllilIi<"IliIlllilIi","MAJu43ItMTusmb/JFLO3Qj7RB94ehOmpBoRv4w4n95gAip0=">(),
      IliIlllilIi<"IliIlllilIi","P+ph3GEmCLYLs4mOWaBeZXPCpUjrREdxswNtJi2LKw==">(),
      IliIlllilIi<"IliIlllilIi","MAJu43ItMTusmb/JFLO3Qj7RB94ehOmpBoRv4w4n95gAip0=">(),
      IliIlllilIi<"IliIlllilIi","uwXFxQEEi/hWVKSDzAijZAl+jgJ/4YnHMme1kVtNPxChAg==">(),
      IliIlllilIi<"IliIlllilIi","4dWfb3Ls1F1+wxCAAH3ilP1WbmQF+FUV74hFyKPE8xI=">()
   );
   private final Set<Long> IIiiiilill;
   private boolean lIIIIIiill;
   private final iilliIlIIiliIl IIIiiilill;
   private static final int llIIIIiill = 100;
   private final iliiliilIiiiliil iIliiilill;
   private final float[] lllIIIiill;

   @Override
   protected void Iilililiiili() {
      this.liliiilill.Iilllilliill();
      this.iiliiilill.IiIlliIliiIl();
      this.IIiiiilill.clear();
      this.iIiiiilill.clear();
      this.lliiiilill = null;
      this.IIIIIIiill = List.of();
      this.iiiiiilill = -1;
      this.lIIIIIiill = false;
      iiiIIIlIIIlIIl.liiiIIllIl();
   }

   private void ilIllIiIll(class_638 world) {
      this.liliiilill.Iilllilliill();
      this.iiliiilill.IiIlliIliiIl();
      this.IIiiiilill.clear();
      this.iIiiiilill.clear();
      this.lliiiilill = world;
      this.iliiiilill = this.Iiiiiilill = -(--2091896439) ^ 55587209;
      if (world != null) {
         this.liliiilill.lIiiIiIlilli(this.IIllllIlll(world));
         this.iliiiilill = Math.max(world.method_31607(), Math.min(this.IIIiiilill.Iilllilliill(), this.lIIiiilill.Iilllilliill()));
         this.Iiiiiilill = Math.min(world.method_31600(), Math.max(this.IIIiiilill.Iilllilliill(), this.lIIiiilill.Iilllilliill()));
         this.liIlliiIll(world);
      }

      this.lIIIIIiill = false;
      iiiIIIlIIIlIIl.liiiIIllIl();
   }

   private void iiiIlIIIll() {
      this.liliiilill.IIillIiliIil();
      iiiIIIlIIIlIIl.liiiIIllIl();
      Iliiiiilliiiii.IliIlllilIi()
         .iIlIlllllill(
            IliIlllilIi<"IliIlllilIi","7Tz9ulSiG5ueE0JvcyRHnp/ypXt0jZMULyVxs6TBPMRD2iII8SFnoe2m">(),
            IliIlllilIi<"IliIlllilIi","fKr42JK1iYs9h9ZV3D067YXiFEteEy7Icgkw0piA4FaQxq+4TctOCX26uTLHOsdriEpedRJNSDQO">(),
            false
         );
   }

   private void ilillIiill(class_332 ctx, IIlIiIlllIlIiIll factor, float f) {
      List var4 = this.IIIIIIiill;
      if (!var4.isEmpty()) {
         class_243 var5 = Iiiilllliiilll.field_1773.method_19418().method_71156();
         double var6 = (double)this.IlIiiilill.Iilllilliill();
         double var8 = var6 * var6;
         ArrayList var10 = new ArrayList();

         for (lliliillililiill var12 : var4) {
            double var13 = (double)var12.illiliiill + 0.5 - var5.field_1352;
            double var15 = (double)var12.Iililiiill + 0.5 - var5.field_1351;
            double var17 = (double)var12.lililiiill + 0.5 - var5.field_1350;
            double var19 = var13 * var13 + var15 * var15 + var17 * var17;
            if (!(var19 > var8)) {
               class_243 var21 = llilllililll.iIlIlllllill(
                  new class_243((double)var12.illiliiill + 0.5, (double)var12.Iililiiill + 1.18, (double)var12.lililiiill + 0.5)
               );
               if (var21 != null && !(var21.field_1350 <= 0.0) && !(var21.field_1350 >= 1.0)) {
                  iliiIlIlIiiiIlIl var22 = new iliiIlIlIiiiIlIl();
                  var22.iiIlllIiIl = var12;
                  var22.IIllllIiIl = Math.sqrt(var19);
                  var22.lIllllIiIl = (float)(var21.field_1352 / (double)f);
                  var22.iIllllIiIl = (float)(var21.field_1351 / (double)f);
                  var10.add(var22);
               }
            }
         }

         if (!var10.isEmpty()) {
            var10.sort((a, b) -> Double.compare(a.IIllllIiIl, b.IIllllIiIl));
            int var23 = Math.min(48, var10.size());
            float var24 = IliiIilliiIi.lIIlllIIliIIlllIIl > 0.0F
               ? IliiIilliiIi.lIIlllIIliIIlllIIl
               : (float)Iiiilllliiilll.method_22683().method_4489() / (float)Iiiilllliiilll.method_22683().method_4495();
            float var25 = IliiIilliiIi.IlIlllIIlllIlllIIl > 0.0F
               ? IliiIilliiIi.IlIlllIIlllIlllIIl
               : (float)Iiiilllliiilll.method_22683().method_4506() / (float)Iiiilllliiilll.method_22683().method_4495();

            for (int var14 = var23 - 1; var14 >= 0; var14--) {
               this.liilliiill(ctx, factor, (iliiIlIlIiiiIlIl)var10.get(var14), var24, var25);
            }
         }
      }
   }

   public static void iIlllIllll(class_638 pos, class_2338 world, class_2680 oldState, class_2680 newState) {
      IIiIlilllIiIlill var4 = iilliilill;
      if (var4 != null && var4.IliIlllilIi()) {
         var4.lllllillll(pos, world, oldState, newState);
      }
   }

   private String IIIillIIil(String mobId) {
      if (mobId == null) {
         return IliIlllilIi<"IliIlllilIi","cKxIULs+Jaqr4mfcWtVTbyEcqwNmmBVGhYkcGRPjaBKy74U=">();
      } else {
         String var2 = this.Iliiiilill.get(mobId);
         if (var2 != null) {
            return var2;
         } else {
            String var3;
            try {
               var3 = class_1299.method_5898(mobId).map(t -> t.method_5897().getString()).orElse(lIIlilIiiIIlilIi.iIlIlllllill(mobId));
            } catch (Throwable var5) {
               var3 = lIIlilIiiIIlilIi.iIlIlllllill(mobId);
            }

            this.Iliiiilill.put(mobId, var3);
            return var3;
         }
      }
   }

   @Override
   public void iIiIlIliIl(JsonElement element) {
      if (element != null && element.isJsonObject()) {
         JsonObject var2 = element.getAsJsonObject();
         if (var2.has(IliIlllilIi<"IliIlllilIi","afe1i+ydiMJs9/cet+mXAcbGH6TreOCVU2Rcou7RVbRnd6v0e0M=">())
            && var2.get(IliIlllilIi<"IliIlllilIi","afe1i+ydiMJs9/cet+mXAcbGH6TreOCVU2Rcou7RVbRnd6v0e0M=">()).isJsonObject()) {
            for (Entry var4 : var2.getAsJsonObject(IliIlllilIi<"IliIlllilIi","afe1i+ydiMJs9/cet+mXAcbGH6TreOCVU2Rcou7RVbRnd6v0e0M=">()).entrySet()) {
               if (((JsonElement)var4.getValue()).isJsonArray()) {
                  ArrayList var5 = new ArrayList();
                  ArrayList var6 = new ArrayList();

                  for (JsonElement var8 : ((JsonElement)var4.getValue()).getAsJsonArray()) {
                     if (var8.isJsonArray()) {
                        JsonArray var9 = var8.getAsJsonArray();
                        if (var9.size() >= 3) {
                           try {
                              var5.add(new int[]{var9.get(0).getAsInt(), var9.get(1).getAsInt(), var9.get(2).getAsInt()});
                              String var10 = var9.size() > 3 ? var9.get(3).getAsString() : "";
                              var6.add(var10.isEmpty() ? null : var10);
                           } catch (Exception var11) {
                           }

                           if (var5.size() >= 4096) {
                              break;
                           }
                        }
                     }
                  }

                  this.liliiilill.Iliilliiilii((String)var4.getKey(), var5, var6);
               }
            }

            this.iiiiiilill = -1;
         }
      }
   }

   public int iIIilIlIil() {
      return this.IIIIIIiill.size();
   }

   private void lllllillll(class_638 world, class_2338 pos, class_2680 newState, class_2680 oldState) {
      boolean var5 = newState.method_27852(class_2246.field_10260);
      boolean var6 = oldState.method_27852(class_2246.field_10260);
      if (var5 || var6) {
         if (world != this.lliiiilill) {
            this.ilIllIiIll(world);
         }

         int var7 = pos.method_10263();
         int var8 = pos.method_10264();
         int var9 = pos.method_10260();
         if (var6) {
            if (var8 < this.iliiiilill || var8 > this.Iiiiiilill) {
               return;
            }

            this.liliiilill.iliIiiliiiii(var7, var8, var9, null);
            this.iIiiiilill.put(iIiIiiIlIliIiiIl.lIiiIiIlilli(var7, var8, var9), 100);
         } else {
            this.iIiiiilill.remove(iIiIiiIlIliIiiIl.lIiiIiIlilli(var7, var8, var9));
            this.liliiilill.IIIllIIliIIl(var7, var8, var9);
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private int lIilliIill(lliliillililiill e) {
      return switch (<unrepresentable>.lllIIIlilillIIIlil[lIIlilIiiIIlilIi.liiiIIllIl(e.IliIlllilIi()).ordinal()]) {
         case 1 -> this.iiIiiilill.Iilllilliill();
         case 2 -> this.IIliiilill.Iilllilliill();
         case 3 -> this.lIliiilill.Iilllilliill();
         case 4 -> this.iIliiilill.Iilllilliill();
         case 5 -> this.Illiiilill.Iilllilliill();
         case 6 -> this.llliiilill.Iilllilliill();
         case 7 -> this.illiiilill.Iilllilliill();
         default -> throw new MatchException(null, null);
      };
   }

   private static int Ilillllill(int rgb, float alpha255) {
      long var3 = -3968657535323602007L;
      var3 ^= (
            (long)class_3532.method_15340(
                     Math.round(alpha255),
                     0,
                     (
                           ~((1243426636 >>> 1 | 1243426636 << 31) << 17 | (1243426636 >>> 1 | 1243426636 << 31) >>> 15) << 31
                              | ~((1243426636 >>> 1 | 1243426636 << 31) << 17 | (1243426636 >>> 1 | 1243426636 << 31) >>> 15) >>> 1
                        )
                        ^ 1750718990
                  )
                  << 32
               ^ var3
         )
         & -1L << 32;
      return (int)(var3 >>> 32) << (-(1962641325 * 43) ^ 1505768937) | rgb & (-(-(-795646230 * 1944890851 * -87)) ^ 392810449);
   }

   private void lIIlliIIll(class_638 world) {
      if (!this.iIiiiilill.isEmpty()) {
         int var2 = 0;

         for (Iterator var3 = this.iIiiiilill.entrySet().iterator(); var3.hasNext() && var2 < 16; var2++) {
            Entry var4 = (Entry)var3.next();
            long var5 = (Long)var4.getKey();
            lliliillililiill var7 = this.liliiilill.Iiilliiliiil(var5);
            if (var7 != null && !var7.liiiIIllIl() && var7.IilliliilIIi()) {
               String var8 = illiliIilili.liiiIIllIl(world.method_8321(new class_2338(var7.illiliiill, var7.Iililiiill, var7.lililiiill)));
               if (var8 != null) {
                  this.liliiilill.IIlllIlliIll(var5, var8);
                  var3.remove();
               } else if ((Integer)var4.getValue() <= 1) {
                  var3.remove();
               } else {
                  var4.setValue((Integer)var4.getValue() - 1);
               }
            } else {
               var3.remove();
            }
         }
      }
   }

   public static void Iillllilll(class_2338 pos) {
      IIiIlilllIiIlill var1 = iilliilill;
      if (var1 != null && var1.IliIlllilIi() && pos != null) {
         var1.iilllIIill(pos);
      }
   }

   private void liIlliiIll(class_638 world) {
      if (Iiiilllliiilll.field_1724 != null) {
         int var2 = Math.min(this.iiiliilill.Iilllilliill(), Iiiilllliiilll.field_1690.method_38521() + 2);
         class_1923 var3 = Iiiilllliiilll.field_1724.method_31476();
         this.iiliiilill.lIiiIiIlilli(var3.field_9181, var3.field_9180);

         for (int var4 = -var2; var4 <= var2; var4++) {
            for (int var5 = -var2; var5 <= var2; var5++) {
               int var6 = var3.field_9181 + var4;
               int var7 = var3.field_9180 + var5;
               if (world.method_8393(var6, var7)) {
                  long var8 = iIiIiiIlIliIiiIl.IliIlllilIi(var6, var7);
                  if (!this.IIiiiilill.contains(var8)) {
                     this.iiliiilill.liiiIIllIl(var8);
                  }
               }
            }
         }
      }
   }

   @Override
   protected void Illillliilli() {
      this.lliiiilill = null;
      this.iliiiilill = this.Iiiiiilill = ~1394309677 * 654471207 + 75 ^ -620739767;
      this.liiiiilill = 0;
      this.iiiiiilill = -1;
      this.IIIIIIiill = List.of();
   }

   private void iilllIIill(class_2338 pos) {
      class_638 var2 = Iiiilllliiilll.field_1687;
      if (var2 != null && var2 == this.lliiiilill && Iiiilllliiilll.method_18854()) {
         long var3 = iIiIiiIlIliIiiIl.lIiiIiIlilli(pos.method_10263(), pos.method_10264(), pos.method_10260());
         if (this.liliiilill.Iiilliiliiil(var3) != null) {
            String var5 = illiliIilili.liiiIIllIl(var2.method_8321(pos));
            if (var5 != null) {
               this.liliiilill.IIlllIlliIll(var3, var5);
               this.iIiiiilill.remove(var3);
            }
         }
      }
   }

   private String IIllllIlll(class_638 world) {
      class_642 var3 = Iiiilllliiilll.method_1558();
      String var2;
      if (var3 != null && var3.field_3761 != null && !var3.field_3761.isBlank()) {
         var2 = IliIlllilIi<"IliIlllilIi","g7SzbZ2L/oE1U+BR4tU+arBTnkdbSRKEb7IS1JFpAw==">() + var3.field_3761.trim().toLowerCase(Locale.ROOT);
      } else if (Iiiilllliiilll.method_1542() && Iiiilllliiilll.method_1576() != null) {
         var2 = IliIlllilIi<"IliIlllilIi","jXthnLZ8BFNmpiWNRL7k5RTp+ZkA4dfUxN3Fsp+Xlg==">() + Iiiilllliiilll.method_1576().method_27728().method_150();
      } else {
         var2 = IliIlllilIi<"IliIlllilIi","SsnxKSxAir6v/Z4WiqVmG1jO0mME0WocEGcAm/+eTUHZnig=">();
      }

      return var2 + IliIlllilIi<"IliIlllilIi","qka7QkeDlUzxfFmPbLfHnS2yJ8yTTGoO1Fi1ehk=">() + world.method_27983().method_29177();
   }

   @Override
   public JsonElement IIiIllIiIl() {
      Map var1 = this.liliiilill.IIiilIiiiIii();
      if (var1.isEmpty()) {
         return null;
      } else {
         JsonObject var2 = new JsonObject();

         for (Entry var4 : var1.entrySet()) {
            JsonArray var5 = new JsonArray();

            for (lliliillililiill var7 : (List)var4.getValue()) {
               JsonArray var8 = new JsonArray();
               var8.add(var7.illiliiill);
               var8.add(var7.Iililiiill);
               var8.add(var7.lililiiill);
               var8.add(var7.IliIlllilIi() == null ? "" : var7.IliIlllilIi());
               var5.add(var8);
            }

            var2.add((String)var4.getKey(), var5);
         }

         JsonObject var9 = new JsonObject();
         var9.add(IliIlllilIi<"IliIlllilIi","afe1i+ydiMJs9/cet+mXAcbGH6TreOCVU2Rcou7RVbRnd6v0e0M=">(), var2);
         return var9;
      }
   }

   public IIiIlilllIiIlill() {
      super(IliIlllilIi<"IliIlllilIi","7Tz9ulSiG5ueE0JvcyRHnp/ypXt0jZMULyVxs6TBPMRD2iII8SFnoe2m">(), lllIllillIll.llIlIIIiilIlIIIi);
      this.iIiliilill = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","ok1j4euvPPW5u40M1nTtwEW3dKC+h1/TPbP1+FixgdAi5xw=">(),
         IliIlllilIi<"IliIlllilIi","KfIXbHqf6KwHWpIe9qo5JBtUUYv4kRZPoDqbcd64bQrZXHn1QEJCDbgqV8YhJshdkpyGLaZuEsnQHl3+2HV6zE9IUMY=">(),
         false
      );
      this.Ililiilill = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","4UPzX/HGO8ogG4j0WtsoIQ4lMAAgYory0PGDZ0Zj6Pc=">(),
         IliIlllilIi<"IliIlllilIi","OyUq4OlgFP1ccETYez25JyuW/iaGBr3VI2MkKpBHAkbBjpnIznF3NUMcaPGK+CwWtAWy0+1VOhqkkHy99FzrAQyKnMmQEv+eow==">(),
         true
      );
      this.lliliilill = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","SEXsxyS+D6pLTpPzF4LP9oAOnYCKhZeaLTNawr8hQd/G6Q==">(),
         IliIlllilIi<"IliIlllilIi","Y5vlDbmYIsxI6EniI1fiJx3axjS9zkBcU60U24GgRS6DOBe5rBPUq8fTQMwpB/Kh8bjbCOJmR8nR/y165k7dEQ==">(),
         true
      );
      this.ililiilill = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","sRaj46Wm+mRj9ANxwdiRPw93qfelj7lzpaOh/gNe+vAyQHWehFBF/E0=">(),
         IliIlllilIi<"IliIlllilIi","U4MAbhc5y1J7SQQ1AFxz1qsllT5k8kM3KWuEobEL5XNqEtauY/EOB1KIE5xEojjlAGaKUNRIlhxRlnMvPPgsWtacPZRxIRXYjTMpF7J3z8oH+eGhsGNsTuou4GsMnw==">(),
         true
      );
      this.Iiiliilill = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","HX2QC5cHpRu+sTeuM3dHAATaTfwwLYgojJkOfqpX3SGkhfgVpLPTRsk=">(),
         IliIlllilIi<"IliIlllilIi","InvSkmDNilstGmPXQG+b8S2csTw1stk9LvBrfM33udNO94IZPRLb2a1iUb2Ms+KWccAB6Ck1zuu1Ll4=">(),
         true
      );
      this.liiliilill = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","ydrgMtlqiN2p+3mX8q37kywwNPT1Py/Kiv/VX0LA3bsQfl3wwq22t9daoYs=">(),
         IliIlllilIi<"IliIlllilIi","AXgggmfjxWZaJpIwQ7tPQfF9Dk2dBxAdNaTsnJsIOdZogCFIKZe9rqmeJBmINJQUO83I3p8qPRAAzA==">(),
         false
      );
      this.iiiliilill = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","vDy6bFKpBiFDpRtKyTAsCELO0MujkbB2Pjzor04ioOMhqVwE9/UXVQ==">(),
         IliIlllilIi<"IliIlllilIi","A4G8aShdxpGlokiABWOTMHy1jMbSKJIKWDbCekBseACNElGEW/2DQhG7ixWpEc0+78GCi39v4dXl2edsJZDaE0PhRLqjNn1RQdu2avijuR5hH5Mve/c5KEevFa6/3riW9Z/CEYTgnmtX4MGAwMmmIKz0Ralq67cBrwnARFUsnldLyPJuQ81CIluhna3tqcOj">(),
         12,
         2,
         32
      );
      this.IIIiiilill = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","zf5NGRAIanj44OD/8PcWsmebU0ewlGikO0kyXhKQr5vz">(),
         IliIlllilIi<"IliIlllilIi","f4402zFRnPEGDxCohMTq57CoQuuE4j1gNmkzp4T2rc88y3cXPm3A4taY8wHlT1gjW09dmpbedzQRUAYK7fwLloiNkteeWMIV2Mr/Guoc3QOq2kUV8V0OAbIjH8DsjSA=">(),
         -64,
         -64,
         320
      );
      this.lIIiiilill = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","8mHIl/9r1VwU5m6V6r7jIvK/VTNIVZ/e/OsZtRPN1hwA">(),
         IliIlllilIi<"IliIlllilIi","2UW+FQ86jsI7K1OzTdv8yOOzxAEh0m5ijywb2uMGCBiGQq8IPmXJVgMIuAcurEak2BqmqMl/sORlSC/mjk5e34+oWYenMHdqmZpJWg==">(),
         320,
         -64,
         320
      );
      this.iIIiiilill = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","ZfuHMo66f3s/kfY/+/ZkeIfvcCQa0n23ZYGO0eRFABCWcWpXNjrZ">(),
         IliIlllilIi<"IliIlllilIi","dzVS2QX2a5aNF5ld72v35+bC0gUOHurd15LbLDt6J+N6bZGToHPC0halrge7LMmFhe09TkdzwXUvMv5MZiimoJoEfondY62OZYF4jJPFR8TnKN1GRQ+8DbNL8xK6paxVQHzryI1GvkvcvrMSlRH/RXORpF9hWLD9V9/CmLPd">(),
         16,
         1,
         64
      );
      this.IlIiiilill = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","USgGwUpncYP/HxzGq7Anro+RWwVmHJb+ZtxfFBFikU/EUcx9W0SzHg==">(),
         IliIlllilIi<"IliIlllilIi","6Lo7BHvS90hcwRY+TSqCoUDoHolXb3lxpWFu4vbJKiYM1lq74GAopHxlmJiv+TgR6OPr0iCFGuJHVY8TsUgiBb1SK2+zs2OPT4/fz+k=">(),
         256,
         16,
         1024
      );
      this.llIiiilill = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","9RxFL3c956pbWz0zLtPR1SILEuP8499M8xtlT8pqZYQyDdvIEHg=">(),
         IliIlllilIi<"IliIlllilIi","a51pHnyviySrqKoDfjg50AzpSazs3DOCM0LLQb4e/D5wksa9n4fWpkTs2jZZvHGNbYzChflxt40vQQ==">(),
         60,
         1,
         255
      );
      this.ilIiiilill = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","PKpxqSIGT69ww7EmrA/PgLoooJCgBuD+bQi8RlQgr1VZzbYZh34=">(),
         IliIlllilIi<"IliIlllilIi","ZVZoVuklOzUq7lNdI7WrnAHq9k9LaAJhQK+iYTEiHy0ZdhT4TWoRfErEZ88XzYhtllAhOPpb/aPHbPzq">(),
         2.0,
         1.0,
         4.0,
         0.5
      );
      this.IiIiiilill = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","I6HmMjg6mSpgjxUxduW4eW3feOkeaU8J2WTW6klqQjT8BeHHz7uX">(),
         IliIlllilIi<"IliIlllilIi","3Peu4mHcaayodWOeeRBuC3XCvmELtnEXnTFtPCF8qc3hs8BsqFg5m9x7m/v0iMpFFtgurWHJ7wmkCknE7nk=">(),
         24.0,
         4.0,
         128.0,
         1.0
      );
      this.liIiiilill = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","cEY9p9BTC3Xzdq1ne3vQg1jwfce+38fa3eAZJiuoyere3isOZZT5wN1Kag==">(),
         IliIlllilIi<"IliIlllilIi","+ga0byGhwwpVXtnKrWuaW4voPFI9HWwBm8gfZjFQJUZQ+Dxk2TYCmSMEuB8wiUOeVadon0GFl5HFM3ED4kSAYzf5LmQvVaKDQI8QGhwr771QvuuslDgVbQyjVq9j">(),
         0.45,
         0.1,
         1.0,
         0.05
      );
      this.iiIiiilill = new iliiliilIiiiliil(
         IliIlllilIi<"IliIlllilIi","bbDA2gRGjnD2F8KXxVq9rteDy7Ddnr90n3zU3v6Lu5mZeA==">(),
         IliIlllilIi<"IliIlllilIi","YOUBbu8UF1D66cjgRoCfw9+XOsNco4efRsWtgCR9I6sTygztMIiknC4CQw==">(),
         -11218092
      );
      this.IIliiilill = new iliiliilIiiiliil(
         IliIlllilIi<"IliIlllilIi","ZaiTX68kDV4HqD3YxyP67GPQxZDgj8EVE2/MGYDx1Bv1qEtd">(),
         IliIlllilIi<"IliIlllilIi","QMVJ2BKU+h9CQTEmsauGNh6lUW3nye52y40vjNPJY2V2RlfYyA2XsxXw1Y+7">(),
         -1644826
      );
      this.lIliiilill = new iliiliilIiiiliil(
         IliIlllilIi<"IliIlllilIi","5s+OL/fZ1q57/ajCKhbPBjLw0sRcH95LfHT94HBeswPUiw==">(),
         IliIlllilIi<"IliIlllilIi","ZKYKoMf3++VzBUT82zGjvINcLIztjYGjNgv0mDNReUu7T/U6EJKfaHcBGw==">(),
         -4169668
      );
      this.iIliiilill = new iliiliilIiiiliil(
         IliIlllilIi<"IliIlllilIi","cWg+N9iezwp8SiyOaIoL7scYLxa6QcbfUnPia5Z3gQ/Se5GSOXe6">(),
         IliIlllilIi<"IliIlllilIi","nr9QDti0v50eGfDV0nwgYF/hShg42dXbRM95SSS/o540/4PlOh830se9XBEu0juX">(),
         -13649736
      );
      this.Illiiilill = new iliiliilIiiiliil(
         IliIlllilIi<"IliIlllilIi","ykj3bt/mGAZFm4gPpjOTE7Dl0iKPXi0R9CcHT9QDQFc+">(),
         IliIlllilIi<"IliIlllilIi","cpEqeO9/g+iAE8O6Ds5vADXhIouJT6i51emKLtMIK4+K0llBTx62vxr3">(),
         -22746
      );
      this.llliiilill = new iliiliilIiiiliil(
         IliIlllilIi<"IliIlllilIi","e+YFHMHgpOMmy9tvkfYVGIY56HIPvHYYgPW8rUDoOKjGXc2q7w==">(),
         IliIlllilIi<"IliIlllilIi","iEbZRmcM04ghpxkiTrWyFCYzyizRsiZXcY1uuu5Gqq8eNVmcjCBjJ6c1xaoZLu1JJXv4N0MZm3ax7R3L/RFHXoFalKpJ+KtlISHcxihk3F4gfVU=">(),
         -4819969
      );
      this.illiiilill = new iliiliilIiiiliil(
         IliIlllilIi<"IliIlllilIi","cKxIULs+Jaqr4mfcWtVTbyEcqwNmmBVGhYkcGRPjaBKy74U=">(),
         IliIlllilIi<"IliIlllilIi","LVG2Zsq5mNYlj8jBO73WC8Vl+yUQTzWaQj8wUDFLma0wa/ZQzTp6lqJV7jW5I+4Ld4yoyaephIQ5v2BY9fxmcy4Emi4KVQ==">(),
         -6516796
      );
      this.Iiliiilill = new ililliIiIiilliIi(
            IliIlllilIi<"IliIlllilIi","iE8ag+gzFzpXqN5U4Ode0oRJfdB5DamwlnkiMkJluMEVrDRsK24MAUb2YLp1">(),
            IliIlllilIi<"IliIlllilIi","7adb/jqZPxLg+BnP1wPX4zmeok7FubWcxh0yeqBS1iFAgDyZgf+WeEPTbr/PaZdv5iyMTqryyII8ZaF6rZ0vbD92CkR6YlfTr+Gb3sE6DvCXfAWTlGmoPg==">(),
            IliIlllilIi<"IliIlllilIi","IIUbz52qK63r+zHm0iey/FflAV/DhsWK8zoGLjgMEF1fng==">(),
            this::iiiIlIIIll
         )
         .Ililllililil();
      this.liliiilill = new IIIiIiIllIIiIiIl();
      this.iiliiilill = new IIillIillIillIil();
      this.IIiiiilill = new HashSet<>();
      this.lIiiiilill = new llliiillii();
      this.iIiiiilill = new HashMap<>();
      this.Iliiiilill = new HashMap<>();
      this.iliiiilill = Integer.MIN_VALUE;
      this.Iiiiiilill = Integer.MIN_VALUE;
      this.iiiiiilill = -1;
      this.IIIIIIiill = List.of();
      this.iIlIIIiill = new String[4];
      this.IllIIIiill = new float[4];
      this.lllIIIiill = new float[4];
      this.illIIIiill = new int[4];
      this.ililiilill.iIlIlllllill(IliIlllilIi<"IliIlllilIi","SEXsxyS+D6pLTpPzF4LP9oAOnYCKhZeaLTNawr8hQd/G6Q==">());
      this.Iiiliilill.iIlIlllllill(IliIlllilIi<"IliIlllilIi","SEXsxyS+D6pLTpPzF4LP9oAOnYCKhZeaLTNawr8hQd/G6Q==">());
      this.liiliilill.iIlIlllllill(IliIlllilIi<"IliIlllilIi","SEXsxyS+D6pLTpPzF4LP9oAOnYCKhZeaLTNawr8hQd/G6Q==">());
      this.iiiliilill.iIlIlllllill(IliIlllilIi<"IliIlllilIi","zCLqOi6q3Ia2vRej4N1g+DK1gl7N6y3vICPH3vQXlTE=">());
      this.IIIiiilill.iIlIlllllill(IliIlllilIi<"IliIlllilIi","zCLqOi6q3Ia2vRej4N1g+DK1gl7N6y3vICPH3vQXlTE=">());
      this.lIIiiilill.iIlIlllllill(IliIlllilIi<"IliIlllilIi","zCLqOi6q3Ia2vRej4N1g+DK1gl7N6y3vICPH3vQXlTE=">());
      this.iIIiiilill.iIlIlllllill(IliIlllilIi<"IliIlllilIi","zCLqOi6q3Ia2vRej4N1g+DK1gl7N6y3vICPH3vQXlTE=">());
      this.IlIiiilill.iIlIlllllill(IliIlllilIi<"IliIlllilIi","cMK6Mih6SMR3H4Ukjv8hiUP9B+TydyisepaXncnxIRUJdQ==">());
      this.llIiiilill.iIlIlllllill(IliIlllilIi<"IliIlllilIi","cMK6Mih6SMR3H4Ukjv8hiUP9B+TydyisepaXncnxIRUJdQ==">());
      this.ilIiiilill.iIlIlllllill(IliIlllilIi<"IliIlllilIi","cMK6Mih6SMR3H4Ukjv8hiUP9B+TydyisepaXncnxIRUJdQ==">());
      this.IiIiiilill.iIlIlllllill(IliIlllilIi<"IliIlllilIi","cMK6Mih6SMR3H4Ukjv8hiUP9B+TydyisepaXncnxIRUJdQ==">());
      this.liIiiilill.iIlIlllllill(IliIlllilIi<"IliIlllilIi","cMK6Mih6SMR3H4Ukjv8hiUP9B+TydyisepaXncnxIRUJdQ==">());
      this.iiIiiilill.iIlIlllllill(IliIlllilIi<"IliIlllilIi","hhJPkMIgN0Qz01T/zFMH/iA2kzAWVn1ujFITI3UgCemBNQ==">());
      this.IIliiilill.iIlIlllllill(IliIlllilIi<"IliIlllilIi","hhJPkMIgN0Qz01T/zFMH/iA2kzAWVn1ujFITI3UgCemBNQ==">());
      this.lIliiilill.iIlIlllllill(IliIlllilIi<"IliIlllilIi","hhJPkMIgN0Qz01T/zFMH/iA2kzAWVn1ujFITI3UgCemBNQ==">());
      this.iIliiilill.iIlIlllllill(IliIlllilIi<"IliIlllilIi","hhJPkMIgN0Qz01T/zFMH/iA2kzAWVn1ujFITI3UgCemBNQ==">());
      this.Illiiilill.iIlIlllllill(IliIlllilIi<"IliIlllilIi","hhJPkMIgN0Qz01T/zFMH/iA2kzAWVn1ujFITI3UgCemBNQ==">());
      this.llliiilill.iIlIlllllill(IliIlllilIi<"IliIlllilIi","hhJPkMIgN0Qz01T/zFMH/iA2kzAWVn1ujFITI3UgCemBNQ==">());
      this.illiiilill.iIlIlllllill(IliIlllilIi<"IliIlllilIi","hhJPkMIgN0Qz01T/zFMH/iA2kzAWVn1ujFITI3UgCemBNQ==">());
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            this.IIiliilill,
            this.lIiliilill,
            this.iIiliilill,
            this.Ililiilill,
            this.lliliilill,
            this.ililiilill,
            this.Iiiliilill,
            this.liiliilill,
            this.iiiliilill,
            this.IIIiiilill,
            this.lIIiiilill,
            this.iIIiiilill,
            this.IlIiiilill,
            this.llIiiilill,
            this.ilIiiilill,
            this.IiIiiilill,
            this.liIiiilill,
            this.iiIiiilill,
            this.IIliiilill,
            this.lIliiilill,
            this.iIliiilill,
            this.Illiiilill,
            this.llliiilill,
            this.illiiilill,
            this.Iiliiilill
         }
      );
      iilliilill = this;
      ClientChunkEvents.CHUNK_LOAD.register((Load)(chunk, world) -> {
         if (this.IliIlllilIi()) {
            if (chunk != this.lliiiilill) {
               this.ilIllIiIll(chunk);
            }

            long var3 = iIiIiiIlIliIiiIl.IliIlllilIi(world.method_12004().field_9181, world.method_12004().field_9180);
            this.IIiiiilill.remove(var3);
            this.iiliiilill.liiiIIllIl(var3);
         }
      });
      ClientChunkEvents.CHUNK_UNLOAD.register((Unload)(chunk, world) -> {
         if (this.IliIlllilIi() && chunk == this.lliiiilill) {
            long var3 = iIiIiiIlIliIiiIl.IliIlllilIi(world.method_12004().field_9181, world.method_12004().field_9180);
            this.iiliiilill.iIlIlllllill(var3);
            this.IIiiiilill.remove(var3);
            this.liliiilill.Illlllllilll(var3);
            this.lIIIIIiill = true;
         }
      });
   }

   @Override
   protected void iIIIlIlIIl() {
      class_638 var1 = Iiiilllliiilll.field_1687;
      if (var1 != this.lliiiilill) {
         this.ilIllIiIll(var1);
      }

      if (var1 != null && Iiiilllliiilll.field_1724 != null) {
         this.liiiiilill++;
         this.liliiilill.IilliliilIIi(this.IIiliilill.Iilllilliill());
         int var2 = Math.max(var1.method_31607(), Math.min(this.IIIiiilill.Iilllilliill(), this.lIIiiilill.Iilllilliill()));
         int var3 = Math.min(var1.method_31600(), Math.max(this.IIIiiilill.Iilllilliill(), this.lIIiiilill.Iilllilliill()));
         if (var2 != this.iliiiilill || var3 != this.Iiiiiilill) {
            this.iliiiilill = var2;
            this.Iiiiiilill = var3;
            this.IIiiiilill.clear();
            this.liIlliiIll(var1);
         }

         class_1923 var4 = Iiiilllliiilll.field_1724.method_31476();
         this.iiliiilill.lIiiIiIlilli(var4.field_9181, var4.field_9180);
         if (this.liiiiilill % 100 == 0) {
            this.liIlliiIll(var1);
         }

         int var5 = this.iIIiiilill.Iilllilliill();
         int var6 = 0;
         int var7 = 0;

         Long var8;
         while (var6 < var5 && var7 < 64 && (var8 = this.iiliiilill.iliIiiliiiii()) != null) {
            class_2818 var9 = var1.method_2935()
               .method_2857(iIiIiiIlIliIiiIl.iIlIlllllill(var8), iIiIiiIlIliIiiIl.IilliliilIIi(var8), class_2806.field_12803, false);
            if (var9 != null) {
               illiliIilili.IliIlllilIi(var9, var2, var3, this.lIiiiilill);
               this.liliiilill.IlIlllIlilIl(var8, this.lIiiiilill.liIIilIliiIIilIl);
               this.IIiiiilill.add(var8);
               var6++;
               var7 += this.lIiiiilill.IIlIilIllIlIilIl;
            }
         }

         this.lIIlliIIll(var1);
         if (this.liiiiilill % 100 == 0) {
            for (lliliillililiill var10 : this.liliiilill.IiIiliIiiiIi(32)) {
               String var11 = illiliIilili.liiiIIllIl(var1.method_8321(new class_2338(var10.illiliiill, var10.Iililiiill, var10.lililiiill)));
               if (var11 != null) {
                  this.liliiilill.IIlllIlliIll(var10.iililiiill, var11);
               }
            }
         }

         this.IlIllllIll();
         if (this.lIIIIIiill && System.currentTimeMillis() - this.iIIIIIiill > 30000L) {
            this.lIIIIIiill = false;
            this.iIIIIIiill = System.currentTimeMillis();
            iiiIIIlIIIlIIl.liiiIIllIl();
         }
      } else {
         this.IlIllllIll();
      }
   }

   private void IlIllllIll() {
      if (this.liliiilill.liiiIIllIl() != this.iiiiiilill) {
         this.iiiiiilill = this.liliiilill.liiiIIllIl();
         this.IIIIIIiill = this.liliiilill.IlIillIiilIi();
      }
   }

   @Override
   protected void Iliilliiilii(lIiIlliiIiIlli event) {
      if (this.lliliilill.Iilllilliill()) {
         if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1755 == null) {
            class_332 var2 = event.IIiIilIIIl;
            class_4587 var3 = new class_4587();
            CorzClient.fontManager.iIlIlllllill(var3);
            IIIiiIillIIiiIil.IliIlllilIi(var3);
            double var4 = (double)Iiiilllliiilll.method_22683().method_4495();
            int var6 = Iiiilllliiilll.method_22683().method_4476(IIililillIililil.iiiIlIIIll(Iiiilllliiilll), Iiiilllliiilll.method_1573());
            float var7 = (float)((double)var6 / var4);
            boolean var8 = Math.abs(var7 - 1.0F) > 1.0E-4F;
            if (var8) {
               IliiIilliiIi.lIIlllIIliIIlllIIl = (float)Math.round((float)Iiiilllliiilll.method_22683().method_4486() / var7);
               IliiIilliiIi.IlIlllIIlllIlllIIl = (float)Math.round((float)Iiiilllliiilll.method_22683().method_4502() / var7);
            }

            IIlIiIlllIlIiIll var9 = IIlIiIlllIlIiIll.lIiiIiIlilli();
            IIlIiIlllIlIiIll var10 = var9.IIillIiliIil() ? var9 : IIlIiIlllIlIiIll.liiiIIllIl();

            try {
               if (var10.IIillIiliIil()) {
                  this.ilillIiill(var2, var10, var7);
                  return;
               }
            } finally {
               if (var8) {
                  IliiIilliiIi.lIIlllIIliIIlllIIl = 0.0F;
                  IliiIilliiIi.IlIlllIIlllIlllIIl = 0.0F;
               }
            }
         }
      }
   }

   private void liilliiill(class_332 ctx, IIlIiIlllIlIiIll visW, iliiIlIlIiiiIlIl visH, float l, float f) {
      lliliillililiill var6 = visH.iiIlllIiIl;
      float var7 = class_3532.method_15363(1.12F - (float)visH.IIllllIiIl / 96.0F, 0.72F, 1.0F);
      float var8 = 18.0F * var7;
      float var9 = 7.0F * var7;
      float var10 = 11.0F * var7;
      float var11 = 5.0F * var7;
      String var12 = this.ililiilill.Iilllilliill()
         ? this.IIIillIIil(var6.IliIlllilIi())
         : IliIlllilIi<"IliIlllilIi","vsBEX9DUW5Kdj7u7NTYdsG6S3q71RApkt9Wzp5d6YCdDPS8=">();
      String var13 = this.Iiiliilill.Iilllilliill()
         ? IliIlllilIi<"IliIlllilIi","dZ3CC5YVygcCsfGbXDLE3wEpZLKbt/TwXkMfI+az">()
            + Math.round(visH.IIllllIiIl)
            + IliIlllilIi<"IliIlllilIi","Y0AS5lNcLZPFCWJN27k2lB9Lpi7frX8bbNOMT7w=">()
         : "";
      String var14 = this.liiliilill.Iilllilliill()
         ? IliIlllilIi<"IliIlllilIi","dZ3CC5YVygcCsfGbXDLE3wEpZLKbt/TwXkMfI+az">()
            + var6.illiliiill
            + IliIlllilIi<"IliIlllilIi","z+3ZfyHXOrZmCIxlocWjAp6Ph0bivovoTDH2X+E=">()
            + var6.Iililiiill
            + IliIlllilIi<"IliIlllilIi","z+3ZfyHXOrZmCIxlocWjAp6Ph0bivovoTDH2X+E=">()
            + var6.lililiiill
         : "";
      String var15 = var6.IilliliilIIi() ? "" : IliIlllilIi<"IliIlllilIi","llmGhMmyu0bJ74LeniJpQ/V4Iew+NLfOd1IiwiAk1/ArxY6T4rS5xw==">();
      float var16 = visW.Iiilliiliiil(var12, var10);
      float var17 = visW.Iiilliiliiil(var13, var10);
      float var18 = visW.Iiilliiliiil(var14, var10);
      float var19 = visW.Iiilliiliiil(var15, var10);
      float var20 = var9 + var16 + var17 + var18 + var19 + var9;
      float var21 = visH.lIllllIiIl - var20 / 2.0F;
      float var22 = visH.iIllllIiIl - var8;
      if (!(var21 + var20 + 16.0F < 0.0F) && !(var21 - 16.0F > l) && !(var22 + var8 + 16.0F < 0.0F) && !(var22 - 16.0F > f)) {
         float var23 = var6.IilliliilIIi() ? 1.0F : (float)this.liIiiilill.Iilllilliill();
         float var24 = IliiIilliiIi.IilliliilIIi(var23);

         try {
            IIIiiIillIIiiIil.Ililllililil(ctx, var21, var22, var20, var8, var11, -233499369, 620756991);
            float var25 = var21 + var9;
            float var26 = var22 + (var8 - visW.IlIillIiilIi(var10)) / 2.0F;
            int var27 = 0;
            this.iIlIIIiill[var27] = var12;
            this.IllIIIiill[var27] = var25;
            this.illIIIiill[var27++] = this.lIilliIill(var6) | 0xFF000000;
            var25 += var16;
            if (!var13.isEmpty()) {
               this.iIlIIIiill[var27] = var13;
               this.IllIIIiill[var27] = var25;
               this.illIIIiill[var27++] = -6645087;
               var25 += var17;
            }

            if (!var14.isEmpty()) {
               this.iIlIIIiill[var27] = var14;
               this.IllIIIiill[var27] = var25;
               this.illIIIiill[var27++] = -6645087;
               var25 += var18;
            }

            if (!var15.isEmpty()) {
               this.iIlIIIiill[var27] = var15;
               this.IllIIIiill[var27] = var25;
               this.illIIIiill[var27++] = -6645087;
            }

            for (int var28 = 0; var28 < var27; var28++) {
               this.lllIIIiill[var28] = var26;
            }

            visW.Iilililiiili(this.iIlIIIiill, this.IllIIIiill, this.lllIIIiill, this.illIIIiill, var27, var10);
         } finally {
            IliiIilliiIi.lIiiIiIlilli(var24);
         }
      }
   }

   @Override
   protected void IIiilIiiiIii(illlllIillll event) {
      List var2 = this.IIIIIIiill;
      if (!var2.isEmpty() && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         int var3 = this.lIiliilill.Ililllililil();
         boolean var4 = var3 == 1 || var3 == 3;
         boolean var5 = var3 == 2 || var3 == 3;
         boolean var6 = this.iIiliilill.Iilllilliill();
         boolean var7 = this.Ililiilill.Iilllilliill();
         if (var4 || var5 || var6 || var7) {
            class_4184 var8 = Iiiilllliiilll.field_1773.method_19418();
            class_243 var9 = var8.method_71156();
            double var10 = (double)this.IlIiiilill.Iilllilliill();
            double var12 = var10 * var10;
            float var14 = (float)this.ilIiiilill.Iilllilliill();
            int var15 = this.llIiiilill.Iilllilliill();
            float var16 = (float)this.liIiiilill.Iilllilliill();
            float var17 = (float)this.IiIiiilill.Iilllilliill();
            float var18 = 0.85F + 0.15F * (float)Math.sin((double)((float)(System.currentTimeMillis() % 10000L) / 1000.0F * 3.0F));
            class_4587 var19 = event.IliiiIIilliiiIIi;
            var19.method_22903();
            var19.method_22904(-var9.field_1352, -var9.field_1351, -var9.field_1350);
            Matrix4f var20 = var19.method_23760().method_23761();
            class_4588 var21 = var7 ? iIiiIIilIliiIIil.IilliliilIIi() : null;

            for (lliliillililiill var23 : var2) {
               double var24 = (double)var23.illiliiill + 0.5;
               double var26 = (double)var23.Iililiiill + 0.5;
               double var28 = (double)var23.lililiiill + 0.5;
               double var30 = var24 - var9.field_1352;
               double var32 = var26 - var9.field_1351;
               double var34 = var28 - var9.field_1350;
               if (!(var30 * var30 + var32 * var32 + var34 * var34 > var12)) {
                  int var36 = this.lIilliIill(var23) & 16777215;
                  float var37 = var23.IilliliilIIi() ? 1.0F : var16;
                  float var38 = (float)var23.illiliiill + 0.002F;
                  float var39 = (float)var23.Iililiiill + 0.002F;
                  float var40 = (float)var23.lililiiill + 0.002F;
                  float var41 = (float)var23.illiliiill + 0.998F;
                  float var42 = (float)var23.Iililiiill + 0.998F;
                  float var43 = (float)var23.lililiiill + 0.998F;
                  if (var5) {
                     iIiiIIilIliiIIil.IIlilIliiIli(
                        var20,
                        var38,
                        var39,
                        var40,
                        var41,
                        var42,
                        var43,
                        (float)(var36 >> 16 & 0xFF) / 255.0F,
                        (float)(var36 >> 8 & 0xFF) / 255.0F,
                        (float)(var36 & 0xFF) / 255.0F,
                        (float)var15 / 255.0F * var37
                     );
                  }

                  if (var4) {
                     iIiiIIilIliiIIil.iIIIlIlIIl(var20, var38, var39, var40, var41, var42, var43, Ilillllill(var36, 255.0F * var37), var14);
                  }

                  if (var6) {
                     Iillllilll.IIlllIlliIll(var24, var26, var28, Ilillllill(var36, 200.0F * var37), Math.max(1.0F, var14 * 0.6F));
                  }

                  if (var21 != null) {
                     double var44 = Math.sqrt(var30 * var30 + var34 * var34);
                     float var46 = var44 > 0.001 ? (float)(var34 / var44) : 1.0F;
                     float var47 = var44 > 0.001 ? (float)(-var30 / var44) : 0.0F;
                     float var48 = 0.14F;
                     float var49 = (float)var23.Iililiiill + 1.0F;
                     int var50 = Ilillllill(var36, 140.0F * var37 * var18);
                     int var51 = Ilillllill(var36, 0.0F);
                     iIiiIIilIliiIIil.IlIlllIlilIl(
                        var21,
                        var20,
                        (float)var24 + var46 * var48,
                        var49,
                        (float)var28 + var47 * var48,
                        var50,
                        (float)var24 - var46 * var48,
                        var49,
                        (float)var28 - var47 * var48,
                        var50,
                        (float)var24 - var46 * var48,
                        var49 + var17,
                        (float)var28 - var47 * var48,
                        var51,
                        (float)var24 + var46 * var48,
                        var49 + var17,
                        (float)var28 + var47 * var48,
                        var51
                     );
                  }
               }
            }

            var19.method_22909();
         }
      }
   }
}
