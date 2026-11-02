package gg.corz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1111;
import net.minecraft.class_1144;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3414;
import net.minecraft.class_1111.class_1112;

public final class IIiiIIlilIiiIIli {
   private static long IiliIiIlIi = 2522541218757483671L ^ -6700830818097292137L;
   public static final String ilIiIiIlIi = "deploy";
   static final float IIliIiIlIi = 0.01F;
   public static final String IiIiIiIlIi = "deploy_butterfly";
   static final int lIliIiIlIi = 24;
   static final float iiIiIiIlIi = 0.3F;
   public static final String liIiIiIlIi = "swish";
   private static final Map<String, class_3414> illiIiIlIi = new HashMap<>();
   private static final IiIIlliIIl IlliIiIlIi = new IiIIlliIIl();
   private static final List<IiliIiIililiIiIi> llliIiIlIi = new ArrayList<>();
   static final String iIliIiIlIi = "corzclient:knife.deploy";

   public static void iliIiiliiiii() {
      for (IiliIiIililiIiIi var1 : llliIiIlIi) {
         var1.IliIlllilIi();
      }

      llliIiIlIi.clear();
   }

   public static void liiiIIllIl(String sound, String run, float volume, float pitch, long style) {
      if (!IIillIiliIil<"IIillIiliIil","AEvFYo+4WjZbL7kFhIDEw0P4afIuH5XI2Cahkz825w==">().equals(sound) && volume > 0.0F) {
         class_310 var6 = class_310.method_1551();
         if (var6 != null) {
            class_1144 var7 = var6.method_1483();
            if (var7 != null) {
               ThreadLocalRandom var8 = ThreadLocalRandom.current();
               if (IillIlilillIli.Illlllllilll(run)) {
                  iIlIlllllill(var7, run, volume, style, var8);
               } else if (!IillIlilillIli.Illillliilli(run)) {
                  float var9 = IiIIlliIIl.IilliliilIIi(volume, var8.nextDouble());
                  float var10 = IiIIlliIIl.lIiiIiIlilli(pitch, iilliliIIilili.liiiIIllIl(run), var8.nextDouble());
                  String var11;
                  if (IIillIiliIil<"IIillIiliIil","NeoUIj4AhBXLEl/lIIitxZHrGG7f3uAliBy4W87ebN4dg8zYNA==">().equals(sound)) {
                     lIiIilliIiIill var12 = iilliliIIilili.iiliIIlIIl.get(run);
                     if (var12 == null) {
                        return;
                     }

                     var11 = var12.IliIlllilIi();
                     var9 *= var12.iIlIlllllill();
                     var10 *= var12.liiiIIllIl();
                  } else {
                     var11 = IIillIiliIil<"IIillIiliIil","sDWJrtRpgcNcdPBpkXiQZKBfbvaegXpibnNFdimke26L7DHhpzGJE8UWzsqS">() + run;
                  }

                  class_3414 var14 = illiIiIlIi.computeIfAbsent(var11, k -> class_3414.method_47908(class_2960.method_60654(k)));
                  IiliIiIililiIiIi var13 = new IiliIiIililiIiIi(
                     var14, Math.min(1.0F, var9), Math.max(0.5F, Math.min(2.0F, var10)), style, var11, var8.nextDouble(), var8.nextLong()
                  );
                  IIIllIIliIIl(var7);
                  var7.method_4873(var13);
                  if (style != (6340776286600632541L ^ 6340776286600632541L)) {
                     llliIiIlIi.add(var13);
                  }
               }
            }
         }
      }
   }

   public static long IilliliilIIi() {
      return ++IiliIiIlIi;
   }

   private IIiiIIlilIiiIIli() {
   }

   private static void iIlIlllllill(class_1144 key, String sounds, float volume, long run, ThreadLocalRandom random) {
      class_2960 var6 = IillIlilillIli.Iilililiiili(sounds);
      if (var6 != null) {
         class_3414 var7 = illiIiIlIi.computeIfAbsent(
            IIillIiliIil<"IIillIiliIil","ME6oSDSR9p9CVOZqdUBxsJAC2fcROrl85GaboWuOlK7HGnrmxUAHOpNYdpeaYOGU9kKu">(),
            k -> class_3414.method_47908(class_2960.method_60654(k))
         );
         IiliIiIililiIiIi var8 = new IiliIiIililiIiIi(
            var7,
            Math.min(1.0F, volume),
            1.0F,
            run,
            IIillIiliIil<"IIillIiliIil","ME6oSDSR9p9CVOZqdUBxsJAC2fcROrl85GaboWuOlK7HGnrmxUAHOpNYdpeaYOGU9kKu">(),
            random.nextDouble(),
            random.nextLong()
         );
         var8.llIliIiIIi = new class_1111(
            var6, r -> 1.0F, r -> 1.0F, 1, class_1112.field_5474, false, false, (~-1515879956 * -349184333 - -73) * 107 ^ -1998551018
         );
         IIIllIIliIIl(key);
         key.method_4873(var8);
         IillIlilillIli.Iiiiliiiiiii();
         if (run != (-4921095916020196596L ^ -4921095916020196596L)) {
            llliIiIlIi.add(var8);
         }
      }
   }

   public static void lIiiIiIlilli(long run) {
      if (run != 0L) {
         for (IiliIiIililiIiIi var3 : llliIiIlIi) {
            if (var3.iIIliIiIIi == run) {
               var3.IliIlllilIi();
            }
         }

         class_310 var4 = class_310.method_1551();
         if (var4 != null && var4.method_1483() != null) {
            IIIllIIliIIl(var4.method_1483());
         }
      }
   }

   private static void IIIllIIliIIl(class_1144 sounds) {
      llliIiIlIi.removeIf(soundsx -> soundsx.method_4793() || !sounds.method_4877(soundsx));

      while (llliIiIlIi.size() > 24) {
         llliIiIlIi.remove(0);
      }
   }

   public static void IliIlllilIi(String style, String sound, float pitch, float volume) {
      liiiIIllIl(style, sound, pitch, volume, 0L);
   }
}
