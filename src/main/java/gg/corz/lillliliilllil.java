package gg.corz;

import com.mojang.authlib.GameProfile;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents.Disconnect;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldExtractionContext;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_638;
import net.minecraft.class_745;
import net.minecraft.class_746;
import net.minecraft.class_898;

public final class lillliliilllil extends class_745 {
   private static volatile lillliliilllil lIlllIIliiIlllIIli;
   private static boolean IllllIIlilllllIIli;
   private static final int iiIllIIliIIlllIIli = 32;
   private static final int IiIllIIliliIllIIli = 99999;
   private final class_638 illllIIliIilllIIli;

   public static void liiiIIllIl() {
      lIlllIIliiIlllIIli = null;
   }

   public static boolean iIlIlllllill(class_638 world) {
      lillliliilllil var1 = lIlllIIliiIlllIIli;
      return var1 != null && world != null && var1.illllIIliIilllIIli == world;
   }

   private lillliliilllil(class_638 profile, GameProfile world) {
      super(profile, world);
      this.illllIIliIilllIIli = profile;
   }

   private static void iliIiiliiiii(WorldExtractionContext context) {
      lillliliilllil var1 = lIlllIIliiIlllIIli;
      if (var1 != null && !IIiIIllIiIIl.IliIlllilIi() && context.world() == var1.illllIIliIilllIIli) {
         class_898 var2 = class_310.method_1551().method_1561();
         class_243 var3 = context.camera().method_71156();
         if (var2.method_3950(var1, context.frustum(), var3.field_1352, var3.field_1351, var3.field_1350)) {
            context.worldState().field_61735.add(var2.method_72977(var1, context.tickCounter().method_60637(true)));
         }
      }
   }

   private void IilliliilIIi(class_243 bodyYaw, float yaw, float pitch, float pos, float headYaw) {
      this.method_5808(bodyYaw.field_1352, bodyYaw.field_1351, bodyYaw.field_1350, yaw, pitch);
      this.field_6038 = bodyYaw.field_1352;
      this.field_5971 = bodyYaw.field_1351;
      this.field_5989 = bodyYaw.field_1350;
      this.method_5847(pos);
      this.field_6259 = pos;
      this.method_5636(headYaw);
      this.field_6220 = headYaw;
      this.method_18799(class_243.field_1353);
   }

   private static int IIIllIIliIIl(class_638 world) {
      long var4 = -7799920104017389213L;
      ThreadLocalRandom var1 = ThreadLocalRandom.current();
      var4 ^= (0L ^ var4) & -1L << 32;

      while ((int)(var4 >>> 32) < 32) {
         var4 ^= ((long)(-(1 + var1.nextInt(99999))) ^ var4) & -1L >>> 32;
         if (world.method_8469((int)var4) == null) {
            return (int)var4;
         }

         var4 += 4294967296L;
      }

      return 0;
   }

   private static void lIiiIiIlilli() {
      if (!IllllIIlilllllIIli) {
         IllllIIlilllllIIli = true;
         WorldRenderEvents.END_EXTRACTION.register(lillliliilllil::iliIiiliiiii);
         ClientPlayConnectionEvents.DISCONNECT.register((Disconnect)(handler, client) -> {
            lillliliilllil var2 = lIlllIIliiIlllIIli;
            if (var2 != null) {
               client.execute(() -> {
                  if (lIlllIIliiIlllIIli == var2) {
                     lIlllIIliiIlllIIli = null;
                  }
               });
            }
         });
      }
   }

   public static void IliIlllilIi(class_638 pitch, class_746 pos, class_243 player, float headYaw, float bodyYaw, float yaw, float world) {
      long var9 = -1344991328076490042L;
      if (pitch != null && pos != null && player != null) {
         lIiiIiIlilli();
         lillliliilllil var7 = lIlllIIliiIlllIIli;
         if (var7 == null || var7.illllIIliIilllIIli != pitch) {
            var9 ^= ((long)IIIllIIliIIl(pitch) << 32 ^ var9) & -1L << 32;
            if ((int)(var9 >>> 32) == 0) {
               lIlllIIliiIlllIIli = null;
               return;
            }

            var7 = new lillliliilllil(pitch, pos.method_7334());
            var7.method_5838((int)(var9 >>> 32));
         }

         var7.method_31548().method_7377(pos.method_31548());
         var7.IilliliilIIi(player, headYaw, bodyYaw, yaw, world);
         lIlllIIliiIlllIIli = var7;
      }
   }
}
