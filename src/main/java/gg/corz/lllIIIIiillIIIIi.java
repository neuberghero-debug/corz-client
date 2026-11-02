package gg.corz;

import com.google.gson.JsonParser;
import com.mojang.authlib.GameProfile;
import com.mojang.serialization.JsonOps;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import net.minecraft.class_2561;
import net.minecraft.class_268;
import net.minecraft.class_310;
import net.minecraft.class_634;
import net.minecraft.class_640;
import net.minecraft.class_642;
import net.minecraft.class_8824;

public class lllIIIIiillIIIIi extends ilIllIiIll {
   private long lliIiiIiil;
   private final Illillllllilll iIiIiiIiil;
   private int iliIiiIiil;
   private final HashMap<UUID, liIIliiliiIIliil> lIiIiiIiil;
   private final iliillIiiill IIiIiiIiil;
   private final iiIiiilIIliiil iIlIiiIiil = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","aje/qZwss6KtoBagsWybZwUEa6YK9zTReoUIOa8A/NTKV/9spx0gVOg=">(),
      IliIlllilIi<"IliIlllilIi","n1rpDqoM+tt5KFo0iqImBFZKNdwgIVky6NyIZkwnX5m9hdY4n7HV46fD/BwypP7omJbN6xsbdx601WZsWU1W22u7y6wOBQXGBuUU">(),
      true
   );
   private static final int IIlIiiIiil = 128;
   private class_634 IliIiiIiil;
   private static String[] iilIiiIiil;
   private static final String lIlIiiIiil = "donutsmp";
   private static final Map<String, UUID> lllIiiIiil = new LinkedHashMap<>();
   private boolean IiiIiiIiil;
   private static final long iiIIiiIiil = 250000000L;
   public static final String[] liIIiiIiil = new String[]{
      IliIlllilIi<"IliIlllilIi","wY9ckRy8X4dROoSRgUa1EF04/kz9dIhfR8WczD1ZJ4gWXIR92xYspw==">(),
      IliIlllilIi<"IliIlllilIi","zsZ924V0EnYy310O3ydtvETTHd4JHd7vPoFfmd8/uskc/g+V">(),
      IliIlllilIi<"IliIlllilIi","UHPrWSDKVQ1Sjc5Fr1lyAfiM0GdfR8TyV/2UrxMgpID8PPuOzqE=">(),
      IliIlllilIi<"IliIlllilIi","VV+26DMCqRNceB8Anar4odDVf3I37lgVu9VtKgdJOPDPkIN8tznUG+DP">(),
      IliIlllilIi<"IliIlllilIi","uVWxIg1PjCB+h8IUH52T0WpHm+t2tAmuq60/kK9cEjDLUNZL">(),
      IliIlllilIi<"IliIlllilIi","PqgSGkIgbLsPxW8FmizvmOF5+QjqfAf23dZBMrZwARFVoPlHrw==">(),
      IliIlllilIi<"IliIlllilIi","VUm5Q+iLXtq+mFoUmWdOwNJz/gOAlnpiNEc3GtRRPPHbXQ==">(),
      IliIlllilIi<"IliIlllilIi","Yf6ktufuOtvAVqRcWseIRmtAqVRGolXVSCdBiH98WKLFjZZ1h0ca">(),
      IliIlllilIi<"IliIlllilIi","7hOnt/ZiAr9dx3DjWhKJ3Hk0Z6p87ny1LrpFkWlnWhorXKnQrfYJcQ==">(),
      IliIlllilIi<"IliIlllilIi","TdKTTi4YsS6JhU80tLBQpWWh85Ioxj7AhvO8UOIpRnlemHbs">(),
      IliIlllilIi<"IliIlllilIi","T2D2RHRwda1WCsELaY5yEmKZ8D61gAUpsMMTwlLb5fBYAbA/">(),
      IliIlllilIi<"IliIlllilIi","X5qCi04Uh2dfDliZY6mcT3TAaXjGjtpvuLb3IkcAYmFLx35/3A==">(),
      IliIlllilIi<"IliIlllilIi","LbA+TZx0/n/Yt/+CmsP4S7n89AvpxVwjxT1Fcf/InAeFfVs=">(),
      IliIlllilIi<"IliIlllilIi","hIbiHsaDm/3pgU2aVP47LqjPI2rkx2pD6C+47SS+wl3PcN3Q">(),
      IliIlllilIi<"IliIlllilIi","ekUsgW6ULkSd8k8l+tgiv760kmmOUA/QG1ysJRG99PdyOX6LweILLRv4">(),
      IliIlllilIi<"IliIlllilIi","V3//LqInE/JM+FqfroIWyQtB6NjxOlwQeYlgLgbW6QU=">(),
      IliIlllilIi<"IliIlllilIi","InqEmB927fCK91A+ATp+mXRxrToMLvNrTNoN5c/NrOeP/Vs0IMLKwQ==">()
   };
   private static boolean IilIiiIiil;
   private static String illIiiIiil;
   private static lllIIIIiillIIIIi lilIiiIiil;
   private final iiIiiilIIliiil IllIiiIiil = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","f1Id7jbcaJZaOkjbc/D68lhvCMm63LQNFSl6bY+hAbLcjw8LVNU=">(),
      IliIlllilIi<"IliIlllilIi","lGxJKUbiy6dATGRDJ3uq/tz+l3UWpWkKT3jd+ZU8a42vuxoN2bVGXkU5YNaI2S0jkKHnvsvfglzYxMe7i2XOtNI3uZ4VAMv7DwhmoQ==">(),
      true
   );

   public int IIllllIlll() {
      return this.IIiIiiIiil.IlIlllIlilIl();
   }

   public static boolean iiiIlIIIll(UUID name, String id) {
      lllIIIIiillIIIIi var2 = lilIiiIiil;
      if (var2 != null) {
         if (!var2.IliIlllilIi()) {
            long var3 = System.nanoTime();
            if (var2.lliIiiIiil == 0L || var3 - var2.lliIiiIiil >= 250000000L) {
               var2.lliIiiIiil = var3;
               var2.Iillllilll();
            }
         }

         List var8 = var2.IIiIiiIiil.iliIiiliiiii();
         if (!var8.isEmpty()) {
            for (int var11 = 0; var11 < var8.size(); var11++) {
               liliIIIliiliIIIl var12 = (liliIIIliiliIIIl)var8.get(var11);
               if (name != null && name.equals(var12.ilIIllllIl) || id != null && id.equalsIgnoreCase(var12.llIIllllIl)) {
                  return true;
               }
            }

            return false;
         }
      }

      if (id != null && !id.isEmpty()) {
         String[] var9 = iilIiiIiil;
         if (var9 == null) {
            var9 = new String[liIIiiIiil.length];

            for (int var4 = 0; var4 < liIIiiIiil.length; var4++) {
               var9[var4] = liIIiiIiil[var4].trim();
            }

            iilIiiIiil = var9;
         }

         for (String var7 : var9) {
            if (!var7.isEmpty() && var7.equalsIgnoreCase(id)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   protected void Illillliilli() {
      this.lliIiiIiil = 0L;
      this.Iillllilll();
   }

   public static boolean iIlllIllll() {
      try {
         class_642 var0 = class_310.method_1551().method_1558();
         String var1 = var0 == null ? null : var0.field_3761;
         if (var1 == null) {
            return false;
         } else {
            if (var1 != illIiiIiil) {
               illIiiIiil = var1;
               IilIiiIiil = lllllillll(var1, IliIlllilIi<"IliIlllilIi","/nM2v3YJcQ6x0Ydylp29pU8xBHvg/KtSbq3jKX/27UxOCbXl">());
            }

            return IilIiiIiil;
         }
      } catch (Throwable var2) {
         return false;
      }
   }

   public boolean lIIlliIIll() {
      return this.iIlIiiIiil.Iilllilliill();
   }

   private void Iillllilll() {
      if (!this.IiiIiiIiil) {
         try {
            this.lIilliIill();
         } catch (Throwable var2) {
            this.IiiIiiIiil = true;
            this.iilllIIill();
         }
      }
   }

   @Override
   protected void Iilililiiili() {
      this.iilllIIill();
   }

   private void iilllIIill() {
      this.lIiIiiIiil.clear();
      this.IliIiiIiil = null;
      this.IIiIiiIiil.IilliliilIIi();
   }

   public List<liliIIIliiliIIIl> ilIllIiIll() {
      return this.IIiIiiIiil.iliIiiliiiii();
   }

   public lllIIIIiillIIIIi() {
      super(IliIlllilIi<"IliIlllilIi","6QBxAwE3X9WLX2m2DbR+S8CEhj2Zg9USDrUk1PJLvEPpguVImWU=">(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.IIiIiiIiil = new iliillIiiill();
      this.lIiIiiIiil = new HashMap<>();
      this.iIiIiiIiil = new Illillllllilll();
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iIlIiiIiil, this.IllIiiIiil});
      lilIiiIiil = this;
   }

   public static void liilliiill(String arg) {
      class_634 var1 = class_310.method_1551().method_1562();
      if (var1 != null) {
         String var2 = arg == null ? "" : arg.trim();

         try {
            Field var3 = class_634.class.getDeclaredField(IliIlllilIi<"IliIlllilIi","gljxn8uDOWsYFCct7rSoaanJ3JdEBxoj2HGZ2uONFs3lnreh/IUDZSXU10VJ">());
            Field var4 = class_634.class.getDeclaredField(IliIlllilIi<"IliIlllilIi","vKxfFGAbmW1dWa3Ae+sG0X9de1D+QDRhRn7sHTUQWnCzc8KFCwAKRI8ipP3vLf10Nvsw">());
            var3.setAccessible(true);
            var4.setAccessible(true);
            Map var5 = (Map)var3.get(var1);
            Set var6 = (Set)var4.get(var1);
            if (var2.isEmpty() || var2.equalsIgnoreCase(IliIlllilIi<"IliIlllilIi","F9wNHFXQuwW89NhwWxQWjXmQQWCIszrxvmMRZALYifne">())) {
               for (UUID var16 : lllIiiIiil.values()) {
                  var6.remove(var5.remove(var16));
               }

               lllIiiIiil.clear();
            } else if (var2.startsWith(IliIlllilIi<"IliIlllilIi","bGYpNekPXMePOtYg5TYz7ggdv/EL7z0KcLYKwNU=">())) {
               UUID var7 = lllIiiIiil.remove(var2.substring(1).trim());
               if (var7 != null) {
                  var6.remove(var5.remove(var7));
               }
            } else {
               int var14 = var2.indexOf(32);
               String var8 = var14 < 0 ? var2 : var2.substring(0, var14);
               String var9 = var14 < 0 ? var8 : var2.substring(var14 + 1).trim();
               UUID var10 = UUID.nameUUIDFromBytes(
                  (IliIlllilIi<"IliIlllilIi","ANBg9ypPtNtdngEeJY7SJiqs3zWaQTKaDW1WLoHSPTO/CYQsRfrycA==">() + var8).getBytes(StandardCharsets.UTF_8)
               );
               class_640 var11 = (class_640)var5.get(var10);
               if (var11 == null) {
                  var11 = new class_640(new GameProfile(var10, var8), false);
                  var5.put(var10, var11);
                  var6.add(var11);
               }

               var11.method_2962(
                  (class_2561)(!var9.startsWith(IliIlllilIi<"IliIlllilIi","iYtwWK5fdsATkzhOteGGriT9EEl2fHmmfuHQ5iM=">())
                        && !var9.startsWith(IliIlllilIi<"IliIlllilIi","dmGwunfaEZAGPHe1qh8vSZZI6Jz6zwM4zEl6Mi8=">())
                     ? class_2561.method_43470(var9.replace('&', '\u00a7'))
                     : (class_2561)class_8824.field_46597.parse(JsonOps.INSTANCE, JsonParser.parseString(var9)).getOrThrow())
               );
               lllIiiIiil.put(var8, var10);
            }
         } catch (Throwable var12) {
         }

         lllIIIIiillIIIIi var13 = (lllIIIIiillIIIIi)llilIllililIll.iliIiiliiiii(lllIIIIiillIIIIi.class);
         if (var13 != null && var13.IliIlllilIi()) {
            var13.lliIiiIiil = 0L;
            var13.Iillllilll();
         }
      }
   }

   @Override
   protected void iIIIlIlIIl() {
      long var1 = System.nanoTime();
      if (this.lliIiiIiil == 0L || var1 - this.lliIiiIiil >= 250000000L) {
         this.lliIiiIiil = var1;
         this.Iillllilll();
      }
   }

   public boolean IlIllllIll() {
      return this.IllIiiIiil.Iilllilliill();
   }

   private void lIilliIill() {
      class_634 var1 = Iiiilllliiilll.method_1562();
      if (var1 != null && Iiiilllliiilll.field_1687 != null && (!this.iIlIiiIiil.Iilllilliill() || iIlllIllll())) {
         if (var1 != this.IliIiiIiil) {
            this.lIiIiiIiil.clear();
            this.IliIiiIiil = var1;
         }

         int var2 = ++this.iliIiiIiil;
         int var3 = 128;
         int var4 = 0;
         this.IIiIiiIiil.IliIlllilIi();

         for (class_640 var6 : var1.method_45732()) {
            GameProfile var7 = var6.method_2966();
            if (var7 != null && var7.id() != null) {
               UUID var8 = var7.id();
               liIIliiliiIIliil var9 = this.lIiIiiIiil.get(var8);
               if (var9 == null) {
                  var9 = new liIIliiliiIIliil();
                  this.lIiIiiIiil.put(var8, var9);
               }

               if (var9.liIilIilil != var2) {
                  var4++;
               }

               var9.liIilIilil = var2;
               if (!var9.IliIlllilIi(var6, var7) && var3 > 0) {
                  var3--;
                  var9.liiiIIllIl(var6, var7);
                  var9.IiIilIilil = this.Ilillllill(var6, var7);
               }

               IliIilllliIill var10 = var9.IiIilIilil;
               if (var10 != null) {
                  this.IIiIiiIiil.liiiIIllIl(var10.IliIlllilIi(), var8, var10.liiiIIllIl(), var10.iIlIlllllill());
               }
            }
         }

         if (var4 != this.lIiIiiIiil.size()) {
            this.lIiIiiIiil.values().removeIf(p -> p.liIilIilil != var2);
         }

         this.IIiIiiIiil.iIlIlllllill();
      } else {
         this.iilllIIill();
      }
   }

   private static boolean lllllillll(String part, String s) {
      int var2 = s.length();

      for (int var3 = 0; var3 + var2 <= part.length(); var3++) {
         if (part.regionMatches(true, var3, s, 0, var2)) {
            return true;
         }
      }

      return false;
   }

   public List<String> liIlliiIll() {
      return this.IIiIiiIiil.IIIllIIliIIl();
   }

   private IliIilllliIill ilillIiill(class_2561 shown, String name) {
      this.iIiIiiIiil.IliIlllilIi();
      shown.method_30937().accept(this.iIiIiiIiil);
      this.iIiIiiIiil.liiiIIllIl();
      return IiIIIIIlliIIIIIl.iIlIlllllill(this.iIiIiiIiil.iIlIllIIiIllIllIIi, name);
   }

   private IliIilllliIill Ilillllill(class_640 e, GameProfile prof) {
      String var3 = prof.name();
      class_268 var4 = e.method_2955();
      class_2561 var5 = e.method_2971();
      Object var6 = var5 != null ? var5 : class_268.method_1142(var4, class_2561.method_43470(var3 == null ? "" : var3));
      return IiIIIIIlliIIIIIl.liiiIIllIl(
         this.ilillIiill((class_2561)var6, var3), IiIIIIIlliIIIIIl.IliIlllilIi(var4 == null ? null : var4.method_1197(), var3), var3
      );
   }
}
